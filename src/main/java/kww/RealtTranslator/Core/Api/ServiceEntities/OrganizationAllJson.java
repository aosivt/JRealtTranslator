package kww.RealtTranslator.Core.Api.ServiceEntities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganizationAllJson {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("short_name")
    private Object shortName;
    @JsonProperty("blocked")
    private Object blocked;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("contact_type")
    private Object contactType;
    @JsonProperty("is_filial_divided")
    private Object isFilialDivided;
    @JsonProperty("post_address")
    private Object postAddress;
    @JsonProperty("city")
    private Object city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getShortName() {
        return shortName;
    }

    public void setShortName(Object shortName) {
        this.shortName = shortName;
    }

    public Object getBlocked() {
        return blocked;
    }

    public void setBlocked(Object blocked) {
        this.blocked = blocked;
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

    public Object getContactType() {
        return contactType;
    }

    public void setContactType(Object contactType) {
        this.contactType = contactType;
    }

    public Object getIsFilialDivided() {
        return isFilialDivided;
    }

    public void setIsFilialDivided(Object isFilialDivided) {
        this.isFilialDivided = isFilialDivided;
    }

    public Object getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(Object postAddress) {
        this.postAddress = postAddress;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }
}
