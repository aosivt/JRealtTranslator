package su.kww.realttranslator.core.api.remote.ngs.services.city;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.id.responses.IdNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.RemoveProcessNgsService;

public interface CityNgsConfig {
    @GET(RemoveProcessNgsService.CITIES_SERVICE_URL)
    Observable<IdNgsResponse> getIdByOldId(@Query("region_id") Integer oldId);
}
