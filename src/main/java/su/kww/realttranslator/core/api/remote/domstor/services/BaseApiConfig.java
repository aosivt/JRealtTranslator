package su.kww.realttranslator.core.api.remote.domstor.services;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import kww.RealtTranslator.Core.Api.Interfaces.UserNamePassword;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BaseApiConfig implements UrlConfig, ServiceConfig {

    protected String baseUrl = "http://api.domstor.ru/";

    UserNamePassword userNamePassword;


    public BaseApiConfig(){}

    public BaseApiConfig(String baseUrl){
        this.baseUrl = baseUrl;
    }

    public abstract BaseApiConfig setUserNamePassword(UserNamePassword userNamePassword);

    protected Retrofit getRetrofitForBaseUrl(){

        return new Retrofit.Builder()
                .client(getHttpClient())
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    protected OkHttpClient getHttpClient(){
        return new OkHttpClient.Builder()
                               .authenticator((route, response) ->
                                               response
                                                    .request().newBuilder()
                                                    .header("Authorization", getBasicAuthorizationString())
                                                    .build())
                                               .build();
    }

    private String getBasicAuthorizationString(){
        return Credentials.basic(userNamePassword.getUsername(), userNamePassword.getPassword());
    }
}
