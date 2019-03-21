package su.kww.realttranslator.core.api.remote.ngs.services.locations.district;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.district.response.NgsStreetResponse;


public interface NgsDistrictConfig {
    @GET(AbstractService.DISTRICT_SERVICE_URL)
    Observable<NgsStreetResponse> getDistrictByCityId(@Query("city_id") Integer regionId, @Query("limit") Integer limit);
}
