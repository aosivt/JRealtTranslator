package su.kww.realttranslator.core.api.inside.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

//                .Table("advert_site_data")
@Entity
@Table(name = "advert_site_data")
public class AdvertSiteData {

//.WithColumn("id").AsInt64().PrimaryKey().Identity()
    @Id
    @Column(name = "id")
    private Long id;
//.WithColumn("site_id").AsInt32().NotNullable()
    @Column(name = "site_id")
    private Integer siteId;
//.WithColumn("data_type").AsInt32().NotNullable()
    @Column(name = "data_type", nullable = false)
    private Integer dataType;
//.WithColumn("domstor_id").AsInt64().NotNullable()
    @Column(name = "domstor_id")
    private Long domstorId;
//.WithColumn("loaded").AsBoolean().WithDefaultValue(false).NotNullable()
    @Column(name = "loaded", nullable = false)
    private Boolean loaded = false;
//.WithColumn("operation_id").AsInt32().WithDefaultValue(0).NotNullable()
    @Column(name = "operation_id")
    private Integer operationId = 0;
//.WithColumn("external_id").AsString(255).Nullable()
    @Column(name = "external_id")
    private String externalId = "";
//.WithColumn("ad_edit_dt").AsDateTime().Nullable()
    @Column(name = "ad_edit_dt")
    private Date advertEditDt;
//.WithColumn("version").AsInt32().WithDefaultValue(0).NotNullable()
    @Column(name = "version")
    private Integer version = 0;
//.WithColumn("locked").AsBoolean().WithDefaultValue(false).NotNullable();
    @Column(name = "locked", nullable = false)
    private Boolean locked = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Long getDomstorId() {
        return domstorId;
    }

    public void setDomstorId(Long domstorId) {
        this.domstorId = domstorId;
    }

    public Boolean getLoaded() {
        return loaded;
    }

    public void setLoaded(Boolean loaded) {
        this.loaded = loaded;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Date getAdvertEditDt() {
        return advertEditDt;
    }

    public void setAdvertEditDt(Date advertEditDt) {
        this.advertEditDt = advertEditDt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}
