package su.kww.realttranslator.core.api.remote.domstor.entities.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import java.io.Serializable;

public class LoginEntity implements Serializable {

    public LoginEntity(){}

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
    private LoginService[] loginService;

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

    public LoginService[] getLoginService() {
        return loginService;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public void setFilialId(Integer filialId) {
        this.filialId = filialId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setAgencyShortName(String agencyShortName) {
        this.agencyShortName = agencyShortName;
    }

    public void setSettingsLevel(String settingsLevel) {
        this.settingsLevel = settingsLevel;
    }

    public void setFilialName(String filialName) {
        this.filialName = filialName;
    }

    public void setLoginService(LoginService[] loginService) {
        this.loginService = loginService;
    }
}
