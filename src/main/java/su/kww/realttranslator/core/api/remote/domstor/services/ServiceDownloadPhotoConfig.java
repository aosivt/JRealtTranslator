package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ServiceDownloadPhotoConfig {
    @Streaming
    @GET
    Observable<Response<ResponseBody>> downloadPhotoByUrl(@Url String photoUrl);
}
