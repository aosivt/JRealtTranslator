package su.kww.realttranslator.core.api.remote.domstor.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class AbstractOptionsValue {
    @SerializedName("id")
    @Expose
    @JsonProperty("id")
    protected Integer id;

    @SerializedName("name")
    @Expose
    @JsonProperty("name")
    protected String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
