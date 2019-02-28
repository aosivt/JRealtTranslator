package su.kww.realttranslator.core.api.remote.domstor.entities.options.feed.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotosMd5 {
    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
