package su.kww.realttranslator.core.api.remote.domstor.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import io.reactivex.Observable;
import okhttp3.*;
import retrofit2.Response;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.options.domstor.data.UploadResult;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import java.util.Set;

public abstract class BaseApiConfig implements UrlConfig {

    protected String baseUrl = "http://api.domstor.ru/";

    protected String basePhotoUrl = "http://static.domstor.ru/";

    private Gson gson = new GsonBuilder()
                                        .setLenient()
                                        .setDateFormat("yyyy-MM-dd HH:mm:ss")
//                                        .setDateFormat(1,1)
                                        .create();

    UserNamePassword userNamePassword;

    public BaseApiConfig(){}

    public BaseApiConfig(String baseUrl){
        this.baseUrl = baseUrl;
    }


    protected Retrofit getRetrofitByUrl(String path){
        return new Retrofit.Builder()
                .client(getHttpClient())
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    protected OkHttpClient getHttpClient(){
        return new OkHttpClient.Builder().authenticator(
                (route, response) -> response.request().newBuilder()
                                             .header("Authorization", getBasicAuthorizationString())
                                             .build()).build();
    }

    private String getBasicAuthorizationString(){
        return Credentials.basic(userNamePassword.getUsername(), userNamePassword.getPassword());
    }

}
