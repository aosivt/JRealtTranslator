package su.kww.realttranslator.core.api.remote.domstor.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveComplex {
    @JsonProperty("id")
    private Object id;

    @JsonProperty("name")
    private Object name;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
}
