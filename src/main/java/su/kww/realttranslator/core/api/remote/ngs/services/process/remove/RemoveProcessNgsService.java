package su.kww.realttranslator.core.api.remote.ngs.services.process.remove;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import io.reactivex.Observable;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractNgsBaseApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.AbstractRemoveArchiveNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.ArchiveProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.RemoveProcessNgsRequest;

import javax.inject.Inject;
import java.io.IOException;

public class RemoveProcessNgsService extends AbstractNgsBaseApiConfig implements NgsUrlConfig, RemoveProcessNgsConfig {

    @Inject
    RemoveProcessNgsService(){
        System.out.println("init".concat(getClass().getName()));
    }

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
    public Observable<Object> archive(AbstractRemoveArchiveNgsRequest request) {
        return getRetrofitForBaseUrl().create(RemoveProcessNgsConfig.class).archive(request);
    }

    @Override
    public Observable<Object> remove(AbstractRemoveArchiveNgsRequest request) {
        return getRetrofitForBaseUrl().create(RemoveProcessNgsConfig.class).remove(request);
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

    public RemoveProcessNgsService setToken(String token){
        this.token = token;
        return this;
    }

}
