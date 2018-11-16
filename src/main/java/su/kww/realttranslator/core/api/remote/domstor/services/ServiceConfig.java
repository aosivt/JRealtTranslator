package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import retrofit2.http.GET;

public interface ServiceConfig {

    @GET(BaseApiConfig.LoginUrl)
    Observable<LoginEntity> getLogin();
    @GET(BaseApiConfig.MailerPresetsUrl)
    Observable<MailerPresentsEntity> getMailer();
    @GET(BaseApiConfig.AdvertsUrl)
    Observable<ServiceAllJson> getAdverts();
}
