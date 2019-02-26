package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;
import retrofit2.http.*;

import java.util.Map;

public interface NgsServiceConfig {

    @Headers("Content-type: application/json")
    @FormUrlEncoded
    @POST(NgsBaseApiConfig.LoginUrl)
    Observable<AuthResponce> postDomstorData(@Query("action") String action,@FieldMap Map<String, String> params);
}

//    @FormUrlEncoded
//    @POST(NgsBaseApiConfig.LoginUrl)
//    Call<Object> postDomstorData(@Query("action") String action, @FieldMap Map<String, String> params);