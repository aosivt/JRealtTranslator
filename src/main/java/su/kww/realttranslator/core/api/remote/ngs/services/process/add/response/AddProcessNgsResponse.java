package su.kww.realttranslator.core.api.remote.ngs.services.process.add.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.MetaData;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.Result;

import java.util.Set;

public class AddProcessNgsResponse {
    @SerializedName("result")
    @Expose
    @JsonProperty("result")
    private Set<Result> results;
    @SerializedName("metadata")
    @Expose
    @JsonProperty("metadata")
    private MetaData metaData;

    public Set<Result> getResults() {
        return results;
    }

    public MetaData getMetaData() {
        return metaData;
    }
}
