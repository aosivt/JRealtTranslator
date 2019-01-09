package su.kww.realttranslator.core.api.inside.database.entities;

import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import javax.persistence.*;
import java.util.Date;

//Create.Table("site_settings")
@Entity
@Table(name = "site_settings")
public class SiteSettings implements EntityDomstor {

    //.WithColumn("site_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "site_id")
    private Integer siteId;
    //.WithColumn("agency_id").AsInt32().PrimaryKey()
    @Column(name = "agency_id")
    private Integer agencyId;
    //.WithColumn("filial_id").AsInt32().PrimaryKey()
    @Column(name = "filial_id")
    private Integer filialId;
    //.WithColumn("agent_id").AsInt32().PrimaryKey()
    @Column(name = "agent_id")
    private Integer agentId;
    //.WithColumn("is_active").AsBoolean().WithDefaultValue(false).NotNullable()
    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;
    //.WithColumn("translation_status").AsInt32().Nullable()
    @Column(name = "translation_status")
    private Integer translationStatus;
    //.WithColumn("translation_date").AsDateTime().Nullable()
    @Column(name = "translation_date", nullable = false)
    private Date translationDate = new Date();
    //.WithColumn("translation_message").AsString(500).Nullable()
    @Column(name = "translation_message", length = 500)
    private String translationMessage;
    //.WithColumn("login").AsString(255).Nullable()
    @Column(name = "login")
    private String login;
    //.WithColumn("password").AsString(255).Nullable();
    @Column(name = "password")
    private String password;
    //.AddColumn("config").AsString(16777215).Nullable();
    @Column(name = "config", length = 16777215)
    private String config;
    //.AddColumn("external_phone").AsString(255).Nullable()
    @Column(name = "external_phone")
    private String externalPhone;

    //.AddColumn("is_autorun_enabled").AsBoolean().WithDefaultValue(false)
    @Column(name = "is_autorun_enabled", nullable = false)
    private Boolean isAutorunEnabled = false;

    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "siteSettings")
    private Site site;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getFilialId() {
        return filialId;
    }

    public void setFilialId(Integer filialId) {
        this.filialId = filialId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getTranslationStatus() {
        return translationStatus;
    }

    public void setTranslationStatus(Integer translationStatus) {
        this.translationStatus = translationStatus;
    }

    public Date getTranslationDate() {
        return translationDate;
    }

    public void setTranslationDate(Date translationDate) {
        this.translationDate = translationDate;
    }

    public String getTranslation_message() {
        return translationMessage;
    }

    public void setTranslation_message(String translationMessage) {
        this.translationMessage = translationMessage;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getTranslationMessage() {
        return translationMessage;
    }

    public String getExternalPhone() {
        return externalPhone;
    }

    public Boolean isAutorunEnabled() {
        return isAutorunEnabled;
    }

    public void setTranslationMessage(String translationMessage) {
        this.translationMessage = translationMessage;
    }

    public void setExternalPhone(String externalPhone) {
        this.externalPhone = externalPhone;
    }

    public void setAutorunEnabled(Boolean autorunEnabled) {
        isAutorunEnabled = autorunEnabled;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Boolean getAutorunEnabled() {
        return isAutorunEnabled;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
