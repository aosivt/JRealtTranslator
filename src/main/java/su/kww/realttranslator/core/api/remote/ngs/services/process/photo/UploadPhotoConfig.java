package su.kww.realttranslator.core.api.remote.ngs.services.process.photo;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.*;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.AddProcessNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;

import java.util.Map;

public interface UploadPhotoConfig {
//    @Multipart
    @POST(AddProcessNgsService.UPLOAD_PHOTOS)
    Observable<ResponseBody> uploadPhoto(@Body MultipartBody file);

    @Multipart
    @POST(AddProcessNgsService.UPLOAD_PHOTOS)
    Observable<UploadPhotoNgsResponse> uploadPhotoByPart(@Part("type") RequestBody type, @Part("media\"; filename=\"1.jpg\"") RequestBody photo);

    @Multipart
    @POST(AddProcessNgsService.UPLOAD_PHOTOS)
    Observable<UploadPhotoNgsResponse> uploadPhotoByPartWithMap(@Part("type") RequestBody type, @PartMap Map<String, RequestBody> photo);
}
