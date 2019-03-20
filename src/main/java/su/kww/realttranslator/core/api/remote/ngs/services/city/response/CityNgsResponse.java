package su.kww.realttranslator.core.api.remote.ngs.services.city.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.ngs.services.city.response.options.Metadata;
import su.kww.realttranslator.core.api.remote.ngs.services.city.response.options.Result;

import java.util.List;

public class CityNgsResponse {
    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
