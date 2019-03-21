package su.kww.realttranslator.core.api.remote.ngs.services.locations.street;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.street.response.NgsStreetResponse;


public interface NgsStreetConfig {
    @GET(AbstractService.STREET_SERVICE_URL)
    Observable<NgsStreetResponse> getStreetsByCityId(@Query("city_id") Integer regionId, @Query("limit") Integer limit);
}
