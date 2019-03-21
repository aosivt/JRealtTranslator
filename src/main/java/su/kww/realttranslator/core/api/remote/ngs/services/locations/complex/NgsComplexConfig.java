package su.kww.realttranslator.core.api.remote.ngs.services.locations.complex;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.response.NgsComplexResponse;


public interface NgsComplexConfig {
    @GET(AbstractService.COMPLEX_SERVICE_URL)
    Observable<NgsComplexResponse> getComplexByCityId(@Query("city_id") Integer regionId);
}
