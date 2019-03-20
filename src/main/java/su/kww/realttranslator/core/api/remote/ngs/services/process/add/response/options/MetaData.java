package su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaData {
    @SerializedName("resultset")
    @Expose
    @JsonProperty("resultset")
    private ResultSet resultSet;

    public ResultSet getResultSet() {
        return resultSet;
    }
}
