package su.kww.realttranslator.core.api.remote.ngs.services.auth;

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
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.AuthNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.AuthNgsResponse;

import javax.inject.Inject;
import java.io.IOException;

public class AuthNgsService extends AbstractNgsBaseApiConfig implements NgsUrlConfig, AuthNgsConfig {

    @Inject
    AuthNgsService(){}

    protected static String BASE_URL = "https://realty.ngs42.ru/";

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
    public Observable<AuthNgsResponse> postAuthNgs(AuthNgsRequest authRequest) {
        return getRetrofitForBaseUrl().create(AuthNgsConfig.class)
                                                .postAuthNgs(authRequest);
    }

    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("referer","https://realty.ngs.ru/cp/")
                .addHeader("host","realty.ngs.ru")
                .addHeader("origin","https://realty.ngs.ru")
                .addHeader("Content-Type","application/json")
                .build();
        return chain.proceed(request);
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    public String getTokenForRequest() throws Exception {
        throw new Exception("this is not call execute method");
    }

    @Override
    public AbstractNgsBaseApiConfig setToken(String token) throws Exception {
        throw new Exception("this is not call execute method");
    }
}
