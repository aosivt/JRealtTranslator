package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.AuthNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.AuthNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.AuthNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.AddProcessNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.AddProcessNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.UploadPhotoService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.BuilderJsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.JsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;

import javax.inject.Inject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NgsApiConfig {

    @Inject
    AuthNgsService authNgsService;
    @Inject
    AuthNgsRequest authNgsRequest;
    @Inject
    AddProcessNgsService addProcessNgsService;
    @Inject
    UploadPhotoService uploadPhotoService;


    private String token;

    private AddProcessNgsResponse addProcessNgsResponse;
    private AddProcessNgsRequest addProcessNgsRequest;



    @Inject
    public NgsApiConfig(){}

    public NgsApiConfig auth(String username, String pass){

        authNgsRequest.setUsername(username);
        authNgsRequest.setPassword(pass);

        authNgsService.postAuthNgs(authNgsRequest)
                            .doOnError(this::setError)
                            .subscribe(this::setToken)
                            .dispose();
        return this;
    }

    public NgsApiConfig add(AddProcessNgsRequest data){
        addProcessNgsService
                            .setToken(token)
                            .add(data)
                            .doOnError(this::setError)
                            .subscribe(this::setAddProcessNgsResponse).dispose();
        return this;
    }

//    public Observable<ResponseBody> uploadPhoto(MultipartBody file){
//        return uploadPhotoService.setToken(token).uploadPhoto(file);
//    }
//
//    public Observable<UploadPhotoNgsResponse> uploadPhotoByPart(RequestBody type, RequestBody photo){
//        return uploadPhotoService.setToken(token).uploadPhotoByPart(type, photo);
//    }

    public NgsApiConfig uploadPhotos(Set<String> pathToPhoto){
        Set<JsonPropertyPhoto> jsonPropertyPhotos = pathToPhoto.stream()
                .map(this::buildRequestForUpload)
                .map(BuilderJsonPropertyPhoto::build)
                .collect(Collectors.toSet());
        addProcessNgsRequest.setPhotos(jsonPropertyPhotos);
        return this;
    }

    private UploadPhotoNgsResponse buildRequestForUpload(String localPathPhoto){
        File file = new File(localPathPhoto);
        Map<String, RequestBody> requestFile = new HashMap<>();
        RequestBody fileBody = RequestBody.create(MultipartBody.FORM, file);
        requestFile.put("media\"; filename=\"".concat(file.getName()).concat("\""), fileBody);
        RequestBody requestType = RequestBody.create(MediaType.parse("text/plain"), "photo");
        return uploadPhotoByPart(requestType,requestFile).firstOrError().blockingGet();
    }

    public Observable<UploadPhotoNgsResponse> uploadPhotoByPart(RequestBody type, Map<String, RequestBody> photo){
        return uploadPhotoService.setToken(token).uploadPhotoByPartWithMap(type, photo);
    }

    private void setAddProcessNgsResponse(AddProcessNgsResponse response) {
        addProcessNgsResponse = response;
    }

    private void setError(Object o) {
        System.out.println(o.toString());
    }

    private void setToken(AuthNgsResponse authNgsResponse) {
        token = authNgsResponse.getResult().getUser().getToken().getAccess();
    }

    public String getToken(){
        return token;
    }

}
