package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.*;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.options.domstor.data.UploadResult;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import java.util.Set;

public interface ServiceConfig {

    @GET(BaseApiConfig.LoginUrl)
    Observable<LoginEntity> getLogin();
    @GET(BaseApiConfig.MailerPresetsUrl)
    Observable<Set<MailerPresentsEntity>> getMailer();
    @GET(BaseApiConfig.AdvertsUrl)
    Observable<Set<ServiceAllJson>> getAdverts();
    @GET(BaseApiConfig.ResourcesUrl)
    Observable<Set<Resource>> getResources();
    @GET(BaseApiConfig.LinksInUrl)
    Observable<Set<LinksSiteJson>> getLinks();

    @Multipart
    @POST(BaseApiConfig.UploadUrl)
    Observable<UploadResult> postDomstorData(@Part MultipartBody.Part file, @Part("file") RequestBody name);
}
