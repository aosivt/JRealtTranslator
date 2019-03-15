package su.kww.realttranslator.core.api.remote.ngs.services.process;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;

public interface ProcessNgsServiceConfig {
    @POST(ProcessNgsBaseApiConfig.PROCESS_URL)
    Observable<Object> add(@Body String request);
}