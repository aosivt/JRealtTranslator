package su.kww.realttranslator.core.api.remote.ngs.services.locations.complex;


import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.response.NgsComplexResponse;

import javax.inject.Inject;

public class NgsComplexService extends AbstractService implements NgsComplexConfig {

    @Inject
    public NgsComplexService(){}


    @Override
    public Observable<NgsComplexResponse> getComplexByCityId(Integer regionId) {
        return getRetrofitForBaseUrl().create(NgsComplexConfig.class).getComplexByCityId(regionId);
    }
}
