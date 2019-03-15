package su.kww.realttranslator.core.api.remote.ngs.services.auth;

import io.reactivex.Observable;
import retrofit2.http.*;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;

public interface AuthNgsServiceConfig {
    @POST(AuthNgsBaseApiConfig.LOGIN_URL)
    Observable<NgsAuthResponce> postAuthNgs(@Body NgsAuthRequest authRequest);
}