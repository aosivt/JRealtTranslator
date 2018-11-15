package kww.RealtTranslator.Core.Api;

import io.reactivex.Observable;
import kww.RealtTranslator.Core.Api.ServiceEntities.LoginService.LoginEntity;
import kww.RealtTranslator.Core.Api.ServiceEntities.MailerPresentsService.MailerPresentsEntity;
import retrofit2.http.GET;

public interface ServiceApiConfig {
    @GET("/rt/login.json")
    Observable<LoginEntity> getLogin();
    @GET("/rt/mailer-presets.json")
    Observable<MailerPresentsEntity> getData();
}
