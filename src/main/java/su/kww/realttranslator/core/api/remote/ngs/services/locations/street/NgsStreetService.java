package su.kww.realttranslator.core.api.remote.ngs.services.locations.street;



import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsUrlConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.street.response.NgsStreetResponse;

import javax.inject.Inject;
import java.util.Objects;

public class NgsStreetService extends AbstractService implements NgsStreetConfig {

    @Inject
    public NgsStreetService(){}

    @Override
    public Observable<NgsStreetResponse> getStreetsByCityId(Integer cityId, Integer limit) {
        if (Objects.isNull(limit)){
            limit = 0;
        }
        return getRetrofitForBaseUrl().create(NgsStreetConfig.class).getStreetsByCityId(cityId, limit);
    }
}
