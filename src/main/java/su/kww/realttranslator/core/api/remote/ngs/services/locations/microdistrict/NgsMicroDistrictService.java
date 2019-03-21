package su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict;



import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict.response.NgsMicroDistrictResponse;

import javax.inject.Inject;
import java.util.Objects;

public class NgsMicroDistrictService extends AbstractService implements NgsMicroDistrictConfig {

    @Inject
    public NgsMicroDistrictService(){}

    @Override
    public Observable<NgsMicroDistrictResponse> getMicroDistrictByCityId(Integer cityId, Integer limit) {
        if (Objects.isNull(limit)){
            limit = 0;
        }
        return getRetrofitForBaseUrl().create(NgsMicroDistrictConfig.class).getMicroDistrictByCityId(cityId, limit);
    }
}
