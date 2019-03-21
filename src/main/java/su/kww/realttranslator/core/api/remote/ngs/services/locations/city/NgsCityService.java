package su.kww.realttranslator.core.api.remote.ngs.services.locations.city;

import io.reactivex.Observable;

import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.city.response.NgsCityResponse;

import javax.inject.Inject;
import java.util.Objects;

public class NgsCityService extends AbstractService implements NgsCityConfig {

    @Inject
    public NgsCityService(){}


    @Override
    public Observable<NgsCityResponse> getCitiesByRegionId(Integer regionId, Integer limit) {
        if (Objects.isNull(limit)){
            limit = 0;
        }
        return getRetrofitForBaseUrl().create(NgsCityConfig.class).getCitiesByRegionId(regionId, limit);
    }
}
