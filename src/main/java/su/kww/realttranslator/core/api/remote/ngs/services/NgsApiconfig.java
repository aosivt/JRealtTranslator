package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;

import javax.inject.Inject;
import java.util.Map;

public class NgsApiconfig extends NgsBaseApiConfig {

    @Inject
    public NgsApiconfig(){}

    @Override
    public Observable<AuthResponce> postDomstorData(String action, Map<String, String> params) {
        return getRetrofitForBaseUrl().create(NgsServiceConfig.class).postDomstorData(ACTION_LOGIN, params);
    }
}
