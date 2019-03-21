package su.kww.realttranslator.core.api.remote.ngs.services.locations.city;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.city.response.NgsCityResponse;


public interface NgsCityConfig {
    @GET(AbstractService.CITIES_SERVICE_URL)
    Observable<NgsCityResponse> getCitiesByRegionId(@Query("region_id") Integer regionId,@Query("limit") Integer limit);
}
