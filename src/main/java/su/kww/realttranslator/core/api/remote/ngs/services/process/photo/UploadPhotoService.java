package su.kww.realttranslator.core.api.remote.ngs.services.process.photo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import io.reactivex.Observable;
import okhttp3.*;

import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractNgsBaseApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;


import javax.inject.Inject;
import java.io.IOException;
import java.util.Map;


public class UploadPhotoService extends AbstractNgsBaseApiConfig implements UploadPhotoConfig {

    private String token;
    protected static String BASE_URL = "https://novosibirsk.n1.ru/";
    private Gson gson = new GsonBuilder()
            .setLenient()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    @Inject
    public UploadPhotoService(){
        System.out.println("init".concat(getClass().getName()));
    }

    @Override
    public Observable<ResponseBody> uploadPhoto(MultipartBody file) {
        return getRetrofitForBaseUrl().create(UploadPhotoConfig.class)
                .uploadPhoto(file);
    }

    @Override
    public Observable<UploadPhotoNgsResponse> uploadPhotoByPart(RequestBody type, RequestBody photo) {
        return getRetrofitForBaseUrl().create(UploadPhotoConfig.class)
                                      .uploadPhotoByPart(type, photo);
    }

    @Override
    public Observable<UploadPhotoNgsResponse> uploadPhotoByPartWithMap(RequestBody type, Map<String, RequestBody> photo) {
        return getRetrofitForBaseUrl().create(UploadPhotoConfig.class)
                .uploadPhotoByPartWithMap(type, photo);
    }

    @Override
    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("Content-Type","application/json")
                .addHeader("referer","https://realty.ngs.ru/cp/add/flat/sell")
                .addHeader("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36")
                .addHeader("x-requested-with","XMLHttpRequest")
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

    public String getTokenForRequest(){
        return String.format("Bearer %s", token);
    }

    public UploadPhotoService setToken(String token){
        this.token = token;
        return this;
    }

}
