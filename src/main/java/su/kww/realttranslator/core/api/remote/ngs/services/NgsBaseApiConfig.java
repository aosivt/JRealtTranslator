package su.kww.realttranslator.core.api.remote.ngs.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import javax.net.ssl.*;
import java.security.cert.CertificateException;

public abstract class NgsBaseApiConfig implements NgsUrlConfig, NgsServiceConfig {

    protected String baseUrl = "https://realty.ngs42.ru/";

    private final static String AUTH_FORMDATA_FORMAT = "from=&login=%s&password=%s";

    private Gson gson = new GsonBuilder()
            .setLenient()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
//                                        .setDateFormat(1,1)
            .create();

    protected Retrofit getRetrofitForBaseUrl(){

        return new Retrofit.Builder()

                .baseUrl(baseUrl)
                .client(getUnsafeOkHttpClient())

//                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            builder.addInterceptor(chain -> {
                Request request  = chain.request()
                        .newBuilder().addHeader("referer","https://realty.ngs.ru/cp/")
                                     .addHeader("host","realty.ngs.ru")
                                     .addHeader("origin","https://realty.ngs.ru")
                                     .addHeader("cookie","ngs_uid=wlUHAlqZDm4tfuYaBCtkAg==; REALTY_FEATURE_photocatalog_redirect=0; ngs_realty=MzM5OTM4NDAyMTUxOTk4MDE0Mw%3D%3D; __gads=ID=0c137141566cd51d:T=1519980148:S=ALNI_MY_NO3JC8ok-cIWcwIa8-8WOVKxKA; _ym_uid=1519980152943046793; Realty_Feature_new_lk=1; ngs_realty_complaint_captcha=MTY4MDMzOTk0OXwxNTE5OTgwMzAzfDk1LjE4MS4yLjM2; REALTY_FEATURE_LK_PROMO_NEW_LIST=0; REALTY_FEATURE_AGENT-832_LK_OVERLAY_MODAL_NEW_LIST=0; n1_cp_offers_cottages_sell=%7B%7D; n1_uid=rBCwn1vIKxMACFiyAAMDMw%3D%3D; n1_cp_offers_commercial_sell=%7B%7D; n1_cp_offers_dachi_sell=%7B%7D; _ga=GA1.2.2127705958.1519980148; LK_ON_NEW_LIST=1; n1_cp_offers_flats_rent_out=%7B%7D; n1_cp_offers_land_sell=%7B%7D; n1_cp_offers_garages_sell=%7B%7D; n1_cp_offers_commercial_rent_out=%7B%7D; n1_cp_offers_flats_sell=%7B%7D; n1_cp_offers_newbuildings_sell=%7B%7D; _ym_d=1547629722; RealtyStoredSearch=1; is_mobile=0; _ga_cid=2127705958.1519980148; public_version_nsk_=version_old; deviceType=desktop; user_with_email=1; current_user_roles_0=%7B%22user_type%22%3A%22professional%22%2C%22user_role%22%3A%7B%22realtor%22%3A%2290-365+days%22%7D%7D; current_user_roles_194=%7B%22user_type%22%3A%22professional%22%2C%22user_role%22%3A%7B%22realtor%22%3A%2290-365+days%22%7D%7D; _gid=GA1.2.229703831.1551238510; _gat_gaRealtyTracker=1; _ym_isad=1; _ym_visorc_32113241=w; _ym_visorc_24185140=w; lastVisited=1551238511; rn_page=main; rn_from_page=notknown")
                                     .build();

                return chain.proceed(request);

            });
            return builder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected String buildAuthStringData(String username, String pass){
        return String.format(AUTH_FORMDATA_FORMAT,username,pass);
    }
}
