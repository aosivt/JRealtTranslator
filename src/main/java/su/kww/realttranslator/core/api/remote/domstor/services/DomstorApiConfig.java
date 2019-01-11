package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.inside.database.entities.UserSettings;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdvertSite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdverts;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryUserSettings;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data.UploadResult;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import javax.inject.Inject;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class DomstorApiConfig extends BaseApiConfig {

    private String errorMessage = "";

    @Inject
    public DomstorApiConfig(){}

    @Override
    public Observable<LoginEntity> getLogin() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getLogin();
    }
    @Override
    public Observable<MailerPresentsEntity> getMailer() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getMailer();
    }
    @Override
    public Observable<Set<ServiceAllJson>> getAdverts() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getAdverts();
    }
    @Override
    public Observable<Set<Resource>> getResources() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getResources();
    }
    @Override
    public Observable<Set<LinksSiteJson>> getLinks() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getLinks();
    }

    @Override
    public Observable<UploadResult> postDomstorData(String type, String name, String data) {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).postDomstorData(type, name, data);
    }

    public void synchronize(String userName, String passWord) {
        setUserNamePassword(createUserPass(userName,passWord));

        getLogin()
//                //.doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateLogin).dispose();
//
//
        getAdverts()
                .doOnError(e->{
                    System.out.println(e.getMessage());
                })
                .subscribe(this::updateAdverts).dispose();

        getResources()
//                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateSite).dispose();

        getLinks()
//                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateAdvertSite).dispose();
    }

    private void setErrorMessage(Throwable throwable) {
        errorMessage = throwable.getMessage();
    }

    private UserNamePassword createUserPass(String userName, String passWord) {
        return new DomstorUsernamePassword(userName, passWord);
    }

    private void updateSite(Set<Resource> resources){
        Set<EntityDomstor>  sites = resources
                .parallelStream()
                .map(RepositorySite::create)
                .collect(Collectors.toSet());
        RepositoryAdverts.updateBySetEntity(sites);
    }

    private void updateLogin(LoginEntity login){
        UserSettings userSettings =  RepositoryUserSettings.create(login);
        RepositoryUserSettings.update(userSettings);
    }

    private void updateAdverts(Set<ServiceAllJson> advertsServiceAllJson){
        Set<EntityDomstor> adverts = advertsServiceAllJson.parallelStream()
                .filter(Objects::nonNull)
                .map(RepositoryAdverts::create)
                .collect(Collectors.toSet());
        RepositoryAdvertSite.clearTableByNameEntity(Advert.class.getName());
        RepositoryAdverts.updateBySetEntity(adverts);
    }

    private void updateAdvertSite(Set<LinksSiteJson> LinksSites){
        Set<EntityDomstor>  advertsites = LinksSites
                .parallelStream()
                .map(RepositoryAdvertSite::create)
                .collect(Collectors.toSet());
        RepositoryAdvertSite.clearTableByNameEntity(AdvertSite.class.getName());
        RepositoryAdvertSite.updateBySetEntity(advertsites);
    }


}
