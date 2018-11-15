package kww.RealtTranslator.Core.Api.ServiceEntities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FilialAllJson {

    @JsonProperty("id")
    private Object id;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("email")
    private Object email;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }
}
