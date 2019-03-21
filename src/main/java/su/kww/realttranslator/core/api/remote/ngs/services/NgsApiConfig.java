package su.kww.realttranslator.core.api.remote.ngs.services;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import su.kww.realttranslator.core.api.remote.ngs.services.auth.AuthNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.AuthNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.AuthNgsResponse;

import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.cooperative.NgsCooperativeService;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.developer.NgsDeveloperService;

import su.kww.realttranslator.core.api.remote.ngs.services.id.IdNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.id.responses.IdNgsResponse;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.city.NgsCityService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.NgsComplexService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.district.NgsDistrictService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict.NgsMicroDistrictService;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.region.NgsRegions;
import su.kww.realttranslator.core.api.remote.ngs.services.locations.street.NgsStreetService;

import su.kww.realttranslator.core.api.remote.ngs.services.process.add.AddProcessNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.AddProcessNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.UploadPhotoService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.BuilderJsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.JsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.RemoveProcessNgsService;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.AbstractRemoveArchiveNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.ArchiveProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request.RemoveProcessNgsRequest;

import javax.inject.Inject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NgsApiConfig {

    @Inject
    AuthNgsService                      authNgsService;
    @Inject
    AuthNgsRequest                      authNgsRequest;
    @Inject
    AddProcessNgsService          addProcessNgsService;
    @Inject
    UploadPhotoService              uploadPhotoService;
    @Inject
    RemoveProcessNgsService    removeProcessNgsService;
    @Inject
    IdNgsService                          idNgsService;
    @Inject
    NgsCityService                         cityService;
    @Inject
    NgsComplexService                   complexService;
    @Inject
    NgsDistrictService                 districtService;
    @Inject
    NgsMicroDistrictService       microDistrictService;
    @Inject
    NgsRegions                                 regions;
    @Inject
    NgsStreetService                     streetService;
    @Inject
    NgsDeveloperService               developerService;
    @Inject
    NgsCooperativeService           cooperativeService;

    private String token;



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

    public AddProcessNgsResponse add(AddProcessNgsRequest data){

        AddProcessNgsResponse response = addProcessNgsService.setToken(token)
                                                             .add(data)
                                                             .doOnError(this::setError)
                                                             .blockingFirst();
        return response;
    }

    public Set<JsonPropertyPhoto> uploadPhotos(Set<String> pathToPhoto){
        Set<JsonPropertyPhoto> jsonPropertyPhotos = pathToPhoto.stream()
                                                                .map(this::buildRequestForUpload)
                                                                .map(BuilderJsonPropertyPhoto::build)
                                                                .collect(Collectors.toSet());
        return jsonPropertyPhotos;
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

    public Observable<Object> archiveOffer(Integer offerId){
        AbstractRemoveArchiveNgsRequest request = new ArchiveProcessNgsRequest().addParams(offerId);
        return removeProcessNgsService.setToken(token).archive(request);
    }
    public Observable<Object> removeOffer(Integer offerId){
        AbstractRemoveArchiveNgsRequest request = new RemoveProcessNgsRequest().addParams(offerId);
        return removeProcessNgsService.setToken(token).remove(request);
    }

    public Observable<IdNgsResponse> getIdByOldId(Integer offerId){
        return idNgsService.setToken(token).getIdByOldId(offerId);
    }

    private void setAddProcessNgsResponse(Object response) {
        System.out.println(response);
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

    public AuthNgsService getAuthNgsService() {
        return authNgsService;
    }

    public AuthNgsRequest getAuthNgsRequest() {
        return authNgsRequest;
    }

    public AddProcessNgsService getAddProcessNgsService() {
        return addProcessNgsService;
    }

    public UploadPhotoService getUploadPhotoService() {
        return uploadPhotoService;
    }

    public RemoveProcessNgsService getRemoveProcessNgsService() {
        return removeProcessNgsService;
    }

    public IdNgsService getIdNgsService() {
        return idNgsService;
    }

    public NgsCityService getCityService() {
        return cityService;
    }

    public NgsComplexService getComplexService() {
        return complexService;
    }

    public NgsDistrictService getDistrictService() {
        return districtService;
    }

    public NgsMicroDistrictService getMicroDistrictService() {
        return microDistrictService;
    }

    public NgsRegions getRegions() {
        return regions;
    }

    public NgsStreetService getStreetService() {
        return streetService;
    }

    public NgsDeveloperService getDeveloperService() {
        return developerService;
    }

    public NgsCooperativeService getCooperativeService() {
        return cooperativeService;
    }
}
