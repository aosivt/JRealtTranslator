package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import kww.RealtTranslator.Core.Api.Interfaces.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;

import javax.inject.Inject;

public class DomstorApiConfig extends BaseApiConfig {

    @Inject
    public DomstorApiConfig(){
        super();
    }

    @Override
    public BaseApiConfig setUserNamePassword(UserNamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
        return this;
    }

    @Override
    public Observable<LoginEntity> getLogin() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getLogin();
    }

    @Override
    public Observable<MailerPresentsEntity> getMailer() {
        return getRetrofitForBaseUrl().create(ServiceConfig.class).getMailer();
    }





}
