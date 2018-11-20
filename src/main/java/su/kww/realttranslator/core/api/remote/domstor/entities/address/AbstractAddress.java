package su.kww.realttranslator.core.api.remote.domstor.entities.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.domstor.entities.AbstractOptionsValue;

public abstract class AbstractAddress extends AbstractOptionsValue {


    @SerializedName("type_id")
    @Expose
    @JsonProperty("type_id")
    protected Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }
}
