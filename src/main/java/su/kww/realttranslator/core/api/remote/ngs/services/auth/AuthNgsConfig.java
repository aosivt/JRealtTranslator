package su.kww.realttranslator.core.api.remote.ngs.services.auth;

import io.reactivex.Observable;
import retrofit2.http.*;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.AuthNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.AuthNgsResponse;

public interface AuthNgsConfig {
    @POST(AuthNgsService.LOGIN_URL)
    Observable<AuthNgsResponse> postAuthNgs(@Body AuthNgsRequest authRequest);
}