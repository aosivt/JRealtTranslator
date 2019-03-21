package su.kww.realttranslator.core.api.remote.ngs.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public abstract class AbstractService extends AbstractNgsBaseApiConfig implements NgsUrlConfig {
    protected static String BASE_URL = "https://realty.ngs.ru/";

    protected String token;

    protected Gson gson = new GsonBuilder()
            .setLenient()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("Content-Type","application/json")
                .build();
        return chain.proceed(request);
    }



    protected Retrofit getRetrofitForBaseUrl(){
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
        return String.format("Bearer %s", token);
    }

    @Override
    public AbstractNgsBaseApiConfig setToken(String token) {
        return this;
    }
}
