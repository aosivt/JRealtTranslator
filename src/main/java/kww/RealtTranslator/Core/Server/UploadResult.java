package kww.RealtTranslator.Core.Server;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadResult {
    @JsonProperty("link")
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
