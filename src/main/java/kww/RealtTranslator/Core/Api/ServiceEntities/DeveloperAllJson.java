package kww.RealtTranslator.Core.Api.ServiceEntities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeveloperAllJson {

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
