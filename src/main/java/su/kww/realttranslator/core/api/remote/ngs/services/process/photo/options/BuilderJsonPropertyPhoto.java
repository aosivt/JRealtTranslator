package su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options;

import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;

public class BuilderJsonPropertyPhoto {
    private BuilderJsonPropertyPhoto(){}

    public static JsonPropertyPhoto build(UploadPhotoNgsResponse uploadPhotoNgsResponse) {
        JsonPropertyPhoto photo = new JsonPropertyPhoto();
        photo.setId(uploadPhotoNgsResponse.getResult().getId());
        photo.setPosition(0);
        photo.setUrl(uploadPhotoNgsResponse.getResult().getUrl());
        photo.setUrlWithSize(uploadPhotoNgsResponse.getResult().getUrlMask());
        return photo;
    }
}
