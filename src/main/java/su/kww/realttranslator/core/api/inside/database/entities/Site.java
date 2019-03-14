package su.kww.realttranslator.core.api.inside.database.entities;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

@Entity
@Table(name = "site")
public class Site implements EntityDomstor, Comparable<Site>  {

//.WithColumn("id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "id")
    private Integer id;
//    .WithColumn("site_key").AsString(45).NotNullable()
    @Column(name = "site_key", length = 45, nullable = false)
    private String siteKey;
//.WithColumn("name").AsString(255).NotNullable()
    @Column(name = "name", nullable = false)
    private String name;
//.WithColumn("updated_at").AsDateTime().NotNullable()
    @Column(name = "update_at", nullable = false)
    private Date updateAt;
//.WithColumn("logo").AsString(16777215).Nullable()
    @Column(name = "logo", length = 16777215, nullable = true)
    private String logo;
//.WithColumn("is_deleted").AsBoolean().WithDefaultValue(false).NotNullable()
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;
//.WithColumn("authorization_required").AsBoolean().WithDefaultValue(false).NotNullable();
    @Column(name = "authorization_required", nullable = false)
    private Boolean authorizationRequired = false;
//AddColumn("status").AsInt32().WithDefaultValue("1");
    @Column(name = "status")
    private Integer status = 1;
//.AddColumn("available_types").AsString(255).Nullable();
    @Column(name = "available_types")
    private String availableTypes;
//.AddColumn("autorun_available").AsBoolean().WithDefaultValue(false);
    @Column(name = "autorun_available")
    private Boolean autorunAvailable = false;

    @OneToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "id", referencedColumnName = "siteId")
    private SiteSettings siteSettings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteKey() {
        return siteKey;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getAuthorizationRequired() {
        return authorizationRequired;
    }

    public void setAuthorizationRequired(Boolean authorizationRequired) {
        this.authorizationRequired = authorizationRequired;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAvailableTypes() {
        return availableTypes;
    }

    public void setAvailableTypes(String availableTypes) {
        this.availableTypes = availableTypes;
    }

    public Boolean getAutorunAvailable() {
        return autorunAvailable;
    }

    public void setAutorunAvailable(Boolean autorunAvailable) {
        this.autorunAvailable = autorunAvailable;
    }

    public SiteSettings getSiteSettings() {
        return siteSettings;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        this.siteSettings = siteSettings;
    }

    @Override
    public int compareTo(Site site) {
        return Comparator.comparing(Site::getSiteKey)
                .thenComparingInt(Site::getId)
                .compare(this, site);
    }
}
