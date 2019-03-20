package su.kww.realttranslator.core.api.remote.ngs.services.city;


import io.reactivex.Observable;
import okhttp3.Interceptor;
import okhttp3.Response;
import retrofit2.Retrofit;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractNgsBaseApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.id.responses.IdNgsResponse;

import java.io.IOException;

public class CityNgsService extends AbstractNgsBaseApiConfig implements NgsUrlConfig, CityNgsConfig {

    @Override
    protected Response rewriteChainRequest(Interceptor.Chain chain) throws IOException {
        return null;
    }

    @Override
    protected Retrofit getRetrofitForBaseUrl() {
        return null;
    }

    @Override
    protected String getBaseUrl() {
        return null;
    }

    @Override
    public String getTokenForRequest() throws Exception {
        return null;
    }

    @Override
    public AbstractNgsBaseApiConfig setToken(String token) throws Exception {
        return null;
    }

    @Override
    public Observable<IdNgsResponse> getIdByOldId(Integer oldId) {
        return null;
    }
}
