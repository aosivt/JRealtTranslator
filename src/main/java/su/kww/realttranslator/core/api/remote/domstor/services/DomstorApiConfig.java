package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import su.kww.realttranslator.core.api.inside.database.entities.*;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.database.repositories.*;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.options.domstor.data.UploadResult;
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
    public Observable<Set<MailerPresentsEntity>> getMailer() {
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
    public Observable<UploadResult> postDomstorData(MultipartBody.Part file, RequestBody name) {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).postDomstorData(file, name);
    }

    public void synchronize(String userName, String passWord) {
        setUserNamePassword(createUserPass(userName,passWord));

        getMailer()
//                //.doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateMailerPresent).dispose();

        getLogin()
//                //.doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateLogin).dispose();
//
//
        getResources()
//                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateSite).dispose();

        getAdverts()
                .doOnError(e->{
                    System.out.println(e.getMessage());
                })
                .subscribe(this::updateAdverts).dispose();

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
                .stream()
//                .parallelStream()
                .map(RepositorySite::create)
                .collect(Collectors.toSet());
        RepositoryAdverts.updateBySetEntity(sites);
    }

    private void updateLogin(LoginEntity login){
        UserSettings userSettings =  RepositoryUserSettings.create(login);
        RepositoryUserSettings.update(userSettings);
    }

    private void updateAdverts(Set<ServiceAllJson> advertsServiceAllJson){
        Set<EntityDomstor> adverts = advertsServiceAllJson.stream()
//                .parallelStream()
                .filter(Objects::nonNull)
//                .sequential()
                .map(RepositoryAdverts::create)
                .collect(Collectors.toSet());
//        RepositoryAdvertSite.clearTableByNameEntity(Advert.class.getName());
        RepositoryAdverts.updateBySetEntity(adverts);
    }

    private void updateAdvertSite(Set<LinksSiteJson> linksSites){
        Set<EntityDomstor> advertsites = linksSites
                .stream()
//                .parallelStream()
                .map(RepositoryAdvertSite::create)
                .collect(Collectors.toSet());
//        RepositoryAdvertSite.clearTableByNameEntity(AdvertSiteUpdate.class.getName());
        RepositoryAdvertSite.updateBySetEntity(advertsites);
    }

    private void updateMailerPresent(Set<MailerPresentsEntity> mailerPresentsEntities){
        Set<EntityDomstor> mailerPresets = mailerPresentsEntities
                .stream()
//                .parallelStream()
                .map(RepositoryMailerPresent::create)
                .collect(Collectors.toSet());
//        RepositoryAdvertSite.clearTableByNameEntity(AdvertSiteUpdate.class.getName());
        RepositoryAdvertSite.updateBySetEntity(mailerPresets);
    }


}
