package kww.RealtTranslator.Core.Api.ServiceEntities.LoginService;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginEntity {

    @SerializedName("user_id")
    @Expose
    @JsonProperty("user_id")
    private Integer userId;

    @SerializedName("agency_id")
    @Expose
    @JsonProperty("agency_id")
    private Integer agencyId;

    @SerializedName("filial_id")
    @Expose
    @JsonProperty("filial_id")
    private Integer filialId;

    @SerializedName("user_name")
    @Expose
    @JsonProperty("user_name")
    private String userName;

    @SerializedName("agency_name")
    @Expose
    @JsonProperty("agency_name")
    private String agencyName;

    @SerializedName("agency_short_name")
    @Expose
    @JsonProperty("agency_short_name")
    private String agencyShortName;

    @SerializedName("settings_level")
    @Expose
    @JsonProperty("settings_level")
    private String settingsLevel;

    @SerializedName("filial_name")
    @Expose
    @JsonProperty("filial_name")
    private String filialName;

    @SerializedName("serv")
    @Expose
    @JsonProperty("serv")
    private ServiceEntity[] serviceEntity;

    public Integer getUserId() {
        return userId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public Integer getFilialId() {
        return filialId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getAgencyShortName() {
        return agencyShortName;
    }

    public String getSettingsLevel() {
        return settingsLevel;
    }

    public String getFilialName() {
        return filialName;
    }

    public ServiceEntity[] getServiceEntity() {
        return serviceEntity;
    }
}
