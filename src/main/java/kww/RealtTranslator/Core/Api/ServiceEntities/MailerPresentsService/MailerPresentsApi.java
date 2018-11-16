package kww.RealtTranslator.Core.Api.ServiceEntities.MailerPresentsService;

import io.reactivex.Observable;
import retrofit2.http.GET;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;

public interface MailerPresentsApi {
    @GET("/rt/login.json")
    Observable<MailerPresentsEntity> getData();
}
