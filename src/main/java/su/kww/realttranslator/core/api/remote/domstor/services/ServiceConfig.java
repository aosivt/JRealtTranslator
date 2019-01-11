package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data.UploadResult;
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
    @GET(BaseApiConfig.LinksInUrl)
    Observable<Set<LinksSiteJson>> getLinks();

    @POST(BaseApiConfig.UploadUrl)
    Observable<UploadResult> postDomstorData(@Field("type") String type,
                                             @Field("name") String name,
                                             @Field("data") String data);
}
