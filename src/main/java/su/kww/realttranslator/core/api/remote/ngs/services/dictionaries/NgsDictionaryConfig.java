package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.NgsDictionaryResponse;


public interface NgsDictionaryConfig {
    @GET(AbstractService.COOPERATIVE_DEVELOPER_SERVICE_URL)
    Observable<NgsDictionaryResponse> getDictionaryValues(
            @Query("name")          String name,
            @Query("rubric")        String rubric,
            @Query("deal_type")     String dealType,
            @Query("with_values")   Boolean withValues,
            @Query("region_id")     Integer regionId,
            @Query("limit")         Integer limit
    );
}
