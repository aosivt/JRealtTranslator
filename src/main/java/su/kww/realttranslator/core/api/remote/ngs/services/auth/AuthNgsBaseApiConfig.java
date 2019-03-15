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
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;

import javax.inject.Inject;
import java.io.IOException;

public class AuthNgsBaseApiConfig extends AbstractNgsBaseApiConfig implements NgsUrlConfig, AuthNgsServiceConfig {

    @Inject
    AuthNgsBaseApiConfig(){}

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
    public Observable<NgsAuthResponce> postAuthNgs(NgsAuthRequest authRequest) {
        return getRetrofitForBaseUrl().create(AuthNgsServiceConfig.class)
                                                .postAuthNgs(authRequest);
    }

    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        Request request  = chain.request()
                .newBuilder()
                .addHeader("referer","https://realty.ngs.ru/cp/")
                .addHeader("host","realty.ngs.ru")
                .addHeader("origin","https://realty.ngs.ru")
                .addHeader("cookie","ngs_uid=wlUHAlqZDm4tfuYaBCtkAg==; REALTY_FEATURE_photocatalog_redirect=0; ngs_realty=MzM5OTM4NDAyMTUxOTk4MDE0Mw%3D%3D; __gads=ID=0c137141566cd51d:T=1519980148:S=ALNI_MY_NO3JC8ok-cIWcwIa8-8WOVKxKA; _ym_uid=1519980152943046793; Realty_Feature_new_lk=1; ngs_realty_complaint_captcha=MTY4MDMzOTk0OXwxNTE5OTgwMzAzfDk1LjE4MS4yLjM2; REALTY_FEATURE_LK_PROMO_NEW_LIST=0; REALTY_FEATURE_AGENT-832_LK_OVERLAY_MODAL_NEW_LIST=0; n1_cp_offers_cottages_sell=%7B%7D; n1_uid=rBCwn1vIKxMACFiyAAMDMw%3D%3D; n1_cp_offers_commercial_sell=%7B%7D; n1_cp_offers_dachi_sell=%7B%7D; _ga=GA1.2.2127705958.1519980148; LK_ON_NEW_LIST=1; n1_cp_offers_flats_rent_out=%7B%7D; n1_cp_offers_land_sell=%7B%7D; n1_cp_offers_garages_sell=%7B%7D; n1_cp_offers_commercial_rent_out=%7B%7D; n1_cp_offers_flats_sell=%7B%7D; n1_cp_offers_newbuildings_sell=%7B%7D; _ym_d=1547629722; RealtyStoredSearch=1; is_mobile=0; _ga_cid=2127705958.1519980148; public_version_nsk_=version_old; deviceType=desktop; user_with_email=1; current_user_roles_0=%7B%22user_type%22%3A%22professional%22%2C%22user_role%22%3A%7B%22realtor%22%3A%2290-365+days%22%7D%7D; current_user_roles_194=%7B%22user_type%22%3A%22professional%22%2C%22user_role%22%3A%7B%22realtor%22%3A%2290-365+days%22%7D%7D; _gid=GA1.2.229703831.1551238510; _gat_gaRealtyTracker=1; _ym_isad=1; _ym_visorc_32113241=w; _ym_visorc_24185140=w; lastVisited=1551238511; rn_page=main; rn_from_page=notknown")
                .build();
        return chain.proceed(request);
    }

    @Override
    protected String getBaseUrl() {
        return BASE_URL;
    }
}
