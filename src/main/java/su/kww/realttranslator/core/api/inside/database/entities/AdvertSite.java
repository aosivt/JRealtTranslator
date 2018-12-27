package su.kww.realttranslator.core.api.inside.database.entities;

import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "advert_site")
public class AdvertSite implements EntityDomstor {
//.WithColumn("advert_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "advert_id")
    private Integer advertId;
//.WithColumn("site_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "site_id")
    private Integer siteId;
//.WithColumn("loaded").AsBoolean().WithDefaultValue(false).NotNullable()
    @Column(name = "loaded", nullable = false)
    private Boolean loaded = false;
//.WithColumn("operation_id").AsInt32().WithDefaultValue(0).NotNullable()
    @Column(name = "operation_id", nullable = false)
    private Integer operationId = 0;
//.WithColumn("external_id").AsString(255).Nullable();
    @Column(name = "external_id")
    private String externalId = "";
//                .AddColumn("domstor_id").AsInt64().Nullable()
    @Column(name = "domstor_id")
    private Long domstorId;
//                .AddColumn("data_type").AsInt32().Nullable()
    @Column(name = "data_type")
    private Integer dataType;
//                .AddColumn("ad_edit_dt").AsDateTime().Nullable()
    @Column(name = "ad_edit_dt")
    private Date advertEditDt;
//    .WithColumn("version").AsInt32().WithDefaultValue(0).NotNullable();
    @Column(name = "version")
    private Integer version;

    public Integer getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Integer advertId) {
        this.advertId = advertId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
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
}
