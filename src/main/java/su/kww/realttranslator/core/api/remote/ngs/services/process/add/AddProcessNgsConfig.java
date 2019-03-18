package su.kww.realttranslator.core.api.remote.ngs.services.process.add;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.AddProcessNgsResponse;

public interface AddProcessNgsConfig {
    @POST(AddProcessNgsService.PROCESS_URL)
    Observable<AddProcessNgsResponse> add(@Body AddProcessNgsRequest request);


}