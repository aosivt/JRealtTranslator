package su.kww.realttranslator.core.api.remote.domstor.entities.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Street extends AbstractAddress {

    @SerializedName("abbr")
    @Expose
    @JsonProperty("abbr")
    private String abbr;

    public String getAbbr() {
        return abbr;
    }
}
