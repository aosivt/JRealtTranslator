package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;
import retrofit2.Call;
import su.kww.realttranslator.core.api.remote.ngs.services.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.responce.auth.NgsAuthResponce;

import javax.inject.Inject;
import java.util.Map;

public class NgsApiconfig extends NgsBaseApiConfig {

    @Inject
    public NgsApiconfig(){}

    @Override
    public Call<Void> postDomstorData(Map<String, String> params) {
        return getRetrofitForBaseUrl()

                .create(NgsServiceConfig.class)

                .postDomstorData(params);
    }


    @Override
    public Call<Object> postAuth(NgsAuthRequest authRequest) {
        return getRetrofitForBaseUrl().create(NgsServiceConfig.class)
                                      .postAuth(authRequest);
    }

    @Override
    public Observable<NgsAuthResponce> postAuthNgs(NgsAuthRequest authRequest) {
        return getRetrofitForBaseUrl().create(NgsServiceConfig.class)
                .postAuthNgs(authRequest);
    }
}
