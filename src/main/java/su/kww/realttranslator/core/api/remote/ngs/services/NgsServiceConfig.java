package su.kww.realttranslator.core.api.remote.ngs.services;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface NgsServiceConfig {

    @Headers({"Content-type: application/x-www-form-urlencoded",
              "user-agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0",
              "accept: */*",
              "accept-encoding: gzip, deflate, br",
              "accept-language: ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4",
              "X-Requested-With: XMLHttpRequest"})

    @FormUrlEncoded
    @POST(NgsBaseApiConfig.LoginUrlAjax)
    Call<Void> postDomstorData(@Query("action") String action, @FieldMap Map<String, String> params);
}

//    @FormUrlEncoded
//    @POST(NgsBaseApiConfig.LoginUrl)
//    Call<Object> postDomstorData(@Query("action") String action, @FieldMap Map<String, String> params);