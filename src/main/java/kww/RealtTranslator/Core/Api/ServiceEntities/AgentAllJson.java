package kww.RealtTranslator.Core.Api.ServiceEntities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgentAllJson {

    @JsonProperty("id")
    private Object id;
    @JsonProperty("name_f")
    private Object surName;
    @JsonProperty("name_i")
    private Object name;
    @JsonProperty("name_o")
    private Object midleName;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("name")
    private Object fullName;
    @JsonProperty("email")
    private Object email;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getSurName() {
        return surName;
    }

    public void setSurName(Object surName) {
        this.surName = surName;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getMidleName() {
        return midleName;
    }

    public void setMidleName(Object midleName) {
        this.midleName = midleName;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getFullName() {
        return fullName;
    }

    public void setFullName(Object fullName) {
        this.fullName = fullName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }
}
