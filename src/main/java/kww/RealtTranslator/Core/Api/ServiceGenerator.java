package kww.RealtTranslator.Core.Api;

import kww.RealtTranslator.Core.Api.Interfaces.IApiConfig;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

import javax.inject.Inject;

public class ServiceGenerator {

    @Inject
    public static IApiConfig API_CONFIG;

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_CONFIG.getLoginUrl());

    private static Retrofit retrofit = builder.build();


    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null, null);
    }

    public static <S> S createService(
            Class<S> serviceClass, String username, String password) {

            String authToken = Credentials.basic(username, password);
            return createService(serviceClass, authToken);

    }

    public static <S> S createService(
            Class<S> serviceClass, final String authToken) {

            HttpLoggingInterceptor interceptor =
                    new HttpLoggingInterceptor();


            if (!httpClient.interceptors().contains(interceptor)) {
                httpClient.addInterceptor(interceptor);

                builder.client(httpClient.build());
                retrofit = builder.build();
            }

        return retrofit.create(serviceClass);
    }
}
