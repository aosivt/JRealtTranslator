package su.kww.realttranslator.core.api.remote.ngs.services.id;

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
import su.kww.realttranslator.core.api.remote.ngs.services.id.responses.IdNgsResponse;

import javax.inject.Inject;
import java.io.IOException;

public class IdNgsService extends AbstractNgsBaseApiConfig implements NgsUrlConfig, IdNgsConfig {

    private String token;

    private Gson gson = new GsonBuilder()
            .setLenient()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    protected static String BASE_URL = "https://novosibirsk.n1.ru/";

    @Inject
    public IdNgsService(){}

    @Override
    public Observable<IdNgsResponse> getIdByOldId(Integer oldId) {
        return getRetrofitForBaseUrl().create(IdNgsConfig.class).getIdByOldId(oldId);
    }

    @Override
    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("Content-Type","application/json")
                .addHeader("Authorization", getTokenForRequest())
                .build();
        return chain.proceed(request);
    }

    @Override
    protected Retrofit getRetrofitForBaseUrl() {
        return new Retrofit.Builder()
                .baseUrl(getBaseUrl())
                .client(getUnsafeOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }

    @Override
    public String getTokenForRequest(){
        return token;
    }

    @Override
    public IdNgsService setToken(String token){
        this.token = token;
        return this;
    }


}
