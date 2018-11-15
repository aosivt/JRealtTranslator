package kww.RealtTranslator.Core.Api.ServiceEntities.LoginService;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface LoginApi {
        @GET("/rt/login.json")
        Observable<LoginEntity> getData();
    }

