package kww.RealtTranslator.Core.Api.ServiceEntities.MailerPresentsService;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MailerPresentsApi {
    @GET("/rt/login.json")
    Observable<MailerPresentsEntity> getData();
}
