package su.kww.realttranslator.core.api.remote.ngs.services.process.remove;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.AbstractRemoveArchiveNgsRequest;

public interface RemoveProcessNgsConfig {
    @POST(RemoveProcessNgsService.REMOVE_PROCESS_URL)
    Observable<Object> remove(@Body AbstractRemoveArchiveNgsRequest request);

    @POST(RemoveProcessNgsService.REMOVE_PROCESS_URL)
    Observable<Object> archive(@Body AbstractRemoveArchiveNgsRequest request);

}