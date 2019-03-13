package su.kww.realttranslator.core.api.remote.domstor.entities.mailer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Date;

public class MailerPresentsEntity {
    @SerializedName("id")
    @Expose
    @JsonProperty("id")
    private Integer id;
    @SerializedName("ssl")
    @Expose
    @JsonProperty("ssl")
    private Integer ssl;
    @SerializedName("port")
    @Expose
    @JsonProperty("port")
    private Integer port;
    @SerializedName("smtp")
    @Expose
    @JsonProperty("smtp")
    private String smtp;
    @SerializedName("login")
    @Expose
    @JsonProperty("login")
    private String login;
    @SerializedName("password")
    @Expose
    @JsonProperty("password")
    private String password;
    @SerializedName("host")
    @Expose
    @JsonProperty("host")
    private String host;

    @SerializedName("title")
    @Expose
    @JsonProperty("title")
    private String title;

    @SerializedName("updatedAt")
    @Expose
    @JsonProperty("updatedAt")
    private Date updatedAt;

    @SerializedName("enabled")
    @Expose
    @JsonProperty("enabled")
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public Integer getSsl() {
        return ssl;
    }

    public Integer getPort() {
        return port;
    }

    public String getSmtp() {
        return smtp;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getTitle() {
        return title;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
