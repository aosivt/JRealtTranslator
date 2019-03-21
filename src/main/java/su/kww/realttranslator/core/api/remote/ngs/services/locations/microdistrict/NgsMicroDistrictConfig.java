package su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict.response.NgsMicroDistrictResponse;


public interface NgsMicroDistrictConfig {
    @GET(AbstractService.MICRODISTRICT_SERVICE_URL)
    Observable<NgsMicroDistrictResponse> getMicroDistrictByCityId(@Query("city_id") Integer regionId, @Query("limit") Integer limit);
}
