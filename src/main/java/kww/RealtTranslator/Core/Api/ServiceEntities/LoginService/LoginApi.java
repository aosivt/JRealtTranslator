package kww.RealtTranslator.Core.Api.ServiceEntities.LoginService;


import io.reactivex.Observable;
import retrofit2.http.GET;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;

public interface LoginApi {
        @GET("/rt/login.json")
        Observable<LoginEntity> getData();
    }

