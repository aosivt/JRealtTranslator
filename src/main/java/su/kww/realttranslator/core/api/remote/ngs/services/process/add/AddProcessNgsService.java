package su.kww.realttranslator.core.api.remote.ngs.services.process.add;

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
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.AddProcessNgsResponse;

import javax.inject.Inject;
import java.io.IOException;

public class AddProcessNgsService extends AbstractNgsBaseApiConfig implements NgsUrlConfig, AddProcessNgsConfig {

    @Inject
    AddProcessNgsService(){}

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
    public Observable<AddProcessNgsResponse> add(AddProcessNgsRequest request) {
        return getRetrofitForBaseUrl().create(AddProcessNgsConfig.class)
                                      .add(request);
    }

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

    public String getTokenForRequest(){
        return String.format("Bearer %s", token);
    }

    public AddProcessNgsService setToken(String token){
        this.token = token;
        return this;
    }

}
