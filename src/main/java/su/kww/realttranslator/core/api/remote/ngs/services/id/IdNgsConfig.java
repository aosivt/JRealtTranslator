package su.kww.realttranslator.core.api.remote.ngs.services.id;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.id.responses.IdNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.RemoveProcessNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.AbstractRemoveArchiveNgsRequest;

public interface IdNgsConfig {
    @GET(RemoveProcessNgsService.CHECK_OLD_IDS_URL)
    Observable<IdNgsResponse> getIdByOldId(@Query("old_ids") Integer oldId);
}