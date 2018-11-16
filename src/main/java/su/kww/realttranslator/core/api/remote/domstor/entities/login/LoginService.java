package su.kww.realttranslator.core.api.remote.domstor.entities.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginService {

    @SerializedName("id")
    @Expose
    @JsonProperty("id")
    private Integer id;

    @SerializedName("name")
    @Expose
    @JsonProperty("name")
    private String name;

    @SerializedName("code")
    @Expose
    @JsonProperty("code")
    private String code;

    @SerializedName("is_system_only")
    @Expose
    @JsonProperty("is_system_only")
    private Boolean isSystemOnly;

    @SerializedName("is_billing_related")
    @Expose
    @JsonProperty("is_billing_related")
    private Boolean isBillingRelated;

    @SerializedName("has_microservice")
    @Expose
    @JsonProperty("has_microservice")
    private Boolean hasMicroservice;

    @SerializedName("user_managed")
    @Expose
    @JsonProperty("user_managed")
    private Boolean userManaged;

    @SerializedName("for_rm")
    @Expose
    @JsonProperty("for_rm")
    private Boolean forRm;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Boolean getSystemOnly() {
        return isSystemOnly;
    }

    public Boolean getBillingRelated() {
        return isBillingRelated;
    }

    public Boolean getHasMicroservice() {
        return hasMicroservice;
    }

    public Boolean getUserManaged() {
        return userManaged;
    }

    public Boolean getForRm() {
        return forRm;
    }
}
