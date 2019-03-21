package su.kww.realttranslator.core.api.remote.ngs.services.locations.district;


import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.district.response.NgsStreetResponse;

import javax.inject.Inject;
import java.util.Objects;

public class NgsDistrictService extends AbstractService implements NgsDistrictConfig {

    @Inject
    public NgsDistrictService(){}

    @Override
    public Observable<NgsStreetResponse> getDistrictByCityId(Integer cityId,  Integer limit) {
        if (Objects.isNull(limit)){
            limit = 0;
        }
        return getRetrofitForBaseUrl().create(NgsDistrictConfig.class).getDistrictByCityId(cityId, limit);
    }
}
