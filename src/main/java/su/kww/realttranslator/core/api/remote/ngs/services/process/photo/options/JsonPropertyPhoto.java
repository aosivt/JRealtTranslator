package su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonPropertyPhoto {
    @SerializedName("is_facade")
    @Expose
    @JsonProperty("is_facade")
    private String isFacade;
    @SerializedName("is_cover")
    @Expose
    @JsonProperty("is_cover")
    private String isCover;
    private String comment;
    private String extension = "jpg";
    private Integer rotation = 0;
    private String id;
    private Integer position;
    private String url;
    @SerializedName("url_with_size")
    @Expose
    @JsonProperty("url_with_size")
    private String urlWithSize;

    public String getIsFacade() {
        return isFacade;
    }

    public void setIsFacade(String isFacade) {
        this.isFacade = isFacade;
    }

    public String getIsCover() {
        return isCover;
    }

    public void setIsCover(String isCover) {
        this.isCover = isCover;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlWithSize() {
        return urlWithSize;
    }

    public void setUrlWithSize(String urlWithSize) {
        this.urlWithSize = urlWithSize;
    }
}
