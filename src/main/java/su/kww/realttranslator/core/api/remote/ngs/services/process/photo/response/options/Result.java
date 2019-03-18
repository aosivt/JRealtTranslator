package su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    private String id;
    private String name;
    private String url;
    @SerializedName("url_mask")
    @Expose
    @JsonProperty("url_mask")
    private String urlMask;
    private String extension;
    private Integer size;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlMask() {
        return urlMask;
    }

    public String getExtension() {
        return extension;
    }

    public Integer getSize() {
        return size;
    }
}
