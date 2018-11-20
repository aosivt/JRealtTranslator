package su.kww.realttranslator.core.api.remote.domstor.entities.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.domstor.entities.AbstractOptionsValue;

import java.util.Date;
import java.util.Set;

public class Resource extends AbstractOptionsValue {


    @SerializedName("updated_at")
    @Expose
    @JsonProperty("updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm:ss")
    private Date updatedAt;
    @JsonProperty("key")
    private String key;
    @JsonProperty("logo")
    private String logo;
    @SerializedName("authorization_required")
    @Expose
    @JsonProperty("authorization_required")
    private Boolean authorizationRequired;
    @SerializedName("autorun_available")
    @Expose
    @JsonProperty("autorun_available")
    private Boolean autorunAvailable;
    @JsonProperty("status")
    private String status;
    @SerializedName("available_types")
    @Expose
    @JsonProperty("available_types")
    private Set<String> availableTypes;

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getKey() {
        return key;
    }

    public String getLogo() {
        return logo;
    }

    public Boolean getAuthorizationRequired() {
        return authorizationRequired;
    }

    public Boolean getAutorunAvailable() {
        return autorunAvailable;
    }

    public String getStatus() {
        return status;
    }

    public Set<String> getAvailableTypes() {
        return availableTypes;
    }
}
