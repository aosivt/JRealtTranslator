package su.kww.realttranslator.core.api.remote.ngs.services;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.cert.CertificateException;

public abstract class AbstractNgsBaseApiConfig {

    protected abstract Response rewriteChainRequest(Interceptor.Chain chain) throws IOException;
    protected abstract Retrofit getRetrofitForBaseUrl();
    protected abstract String getBaseUrl();

    protected OkHttpClient getUnsafeOkHttpClient() {
        try {
            X509TrustManager manager = getX509TrustManager();
            final TrustManager[] trustAllCerts = new TrustManager[] { manager };
            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, manager);
            builder.hostnameVerifier((hostname, session) -> true);
            builder.addInterceptor(this::rewriteChainRequest);
            return builder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private X509TrustManager getX509TrustManager(){
        return new X509TrustManager() {
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
        };
    }

}
