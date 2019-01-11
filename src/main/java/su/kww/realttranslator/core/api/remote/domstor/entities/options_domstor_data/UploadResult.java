package su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UploadResult {

    @SerializedName("link")
    @Expose
    @JsonProperty("link")
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
