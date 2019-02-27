package su.kww.realttranslator.core.api.remote.ngs.services;

import retrofit2.Call;

import javax.inject.Inject;
import java.util.Map;

public class NgsApiconfig extends NgsBaseApiConfig {

    @Inject
    public NgsApiconfig(){}

    @Override
    public Call<Void> postDomstorData(String action, Map<String, String> params) {
        return getRetrofitForBaseUrl()

                .create(NgsServiceConfig.class)

                .postDomstorData(ACTION_LOGIN, params);
    }
}
