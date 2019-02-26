package su.kww.realttranslator.core.api.remote.domstor.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agent {

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
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
