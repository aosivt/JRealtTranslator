package su.kww.realttranslator.core.api.remote.domstor.entities.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.domstor.entities.AbstractOptionsValue;

public class SubRegion extends AbstractOptionsValue {


    @SerializedName("type_name")
    @Expose
    @JsonProperty("type_name")
    protected String typeName;


    public String getTypeName() {
        return typeName;
    }
}
