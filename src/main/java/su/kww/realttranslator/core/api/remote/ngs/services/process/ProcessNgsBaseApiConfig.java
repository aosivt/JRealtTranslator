package su.kww.realttranslator.core.api.remote.ngs.services.process;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import io.reactivex.Observable;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractNgsBaseApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.AuthNgsServiceConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;

import javax.inject.Inject;
import java.io.IOException;

public class ProcessNgsBaseApiConfig extends AbstractNgsBaseApiConfig implements NgsUrlConfig, ProcessNgsServiceConfig {

    @Inject
    ProcessNgsBaseApiConfig(){}

    protected static String BASE_URL = "https://novosibirsk.n1.ru/";

    private String token;

    private Gson gson = new GsonBuilder()
                                        .setLenient()
                                        .setDateFormat("yyyy-MM-dd HH:mm:ss")
                                        .create();

    protected Retrofit getRetrofitForBaseUrl(){
        return new Retrofit.Builder()
                           .baseUrl(getBaseUrl())
                           .client(getUnsafeOkHttpClient())
                           .addConverterFactory(GsonConverterFactory.create(gson))
                           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                           .build();
    }

    @Override
    public Observable<Object> add(String request) {
        return getRetrofitForBaseUrl().create(ProcessNgsServiceConfig.class)
                                      .add(request);
    }
//    {https://novosibirsk.n1.ru/api/rn/v2/offers/homes/?isPreview=0}
//    {User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0
//        Accept: */*
//Content-Type: application/x-www-form-urlencoded
//Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4

//}
    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("Content-Type","application/json")
                .addHeader("Authorization", getTokenForRequest())
                .build();
        return chain.proceed(request);
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    private String getTokenForRequest(){
        return String.format("Bearer %s", token);
    }

    public ProcessNgsBaseApiConfig setToken(String token){
        this.token = token;
        return this;
    }

}
