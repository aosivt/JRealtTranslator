package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.*;
import su.kww.realttranslator.core.api.remote.ngs.services.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.responce.auth.NgsAuthResponce;

import java.util.Map;

public interface NgsServiceConfig {

    @Headers({"Content-type: application/json",
            "Refer: https://novosibirsk.n1.ru/login/"})

    @FormUrlEncoded
    @POST(NgsBaseApiConfig.LoginUrl)
    Call<Void> postDomstorData(@FieldMap Map<String, String> params);

    @Headers({"Content-type: application/json",
              "Referer: https://novosibirsk.n1.ru/login/"})

    @POST(NgsBaseApiConfig.LoginUrl)
    Call<Object> postAuth(@Body NgsAuthRequest authRequest);

    @POST(NgsBaseApiConfig.LoginUrl)
    Observable<NgsAuthResponce> postAuthNgs(@Body NgsAuthRequest authRequest);
//}

//    @FormUrlEncoded
//    @POST(NgsBaseApiConfig.LoginUrl)
//    Call<Object> postDomstorData( @FieldMap Map<String, String> params);
}