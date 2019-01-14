package su.kww.realttranslator.core.api.remote.domstor.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BaseApiConfig implements UrlConfig, ServiceConfig {

    protected String baseUrl = "http://api.domstor.ru/";

    private Gson gson = new GsonBuilder()
                                        .setLenient()
                                        .setDateFormat("yyyy-mm-dd hh:mm:ss")
                                        .create();

    UserNamePassword userNamePassword;

    public BaseApiConfig(){}

    public BaseApiConfig(String baseUrl){
        this.baseUrl = baseUrl;
    }


    protected Retrofit getRetrofitForBaseUrl(){

        return new Retrofit.Builder()
                .client(getHttpClient())
                .baseUrl(baseUrl)
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

    public BaseApiConfig setUserNamePassword(UserNamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
        return this;
    }
}
