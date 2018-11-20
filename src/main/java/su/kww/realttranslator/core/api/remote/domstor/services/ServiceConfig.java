package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import retrofit2.http.GET;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import java.util.Set;

public interface ServiceConfig {

    @GET(BaseApiConfig.LoginUrl)
    Observable<LoginEntity> getLogin();
    @GET(BaseApiConfig.MailerPresetsUrl)
    Observable<MailerPresentsEntity> getMailer();
    @GET(BaseApiConfig.AdvertsUrl)
    Observable<Set<ServiceAllJson>> getAdverts();
    @GET(BaseApiConfig.ResourcesUrl)
    Observable<Set<Resource>> getResources();
}
