package su.kww.realttranslator.core.api.inside.database.entities;

import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "advert_site")
public class AdvertSite implements EntityDomstor {
//.WithColumn("advert_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
//.WithColumn("site_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "site_id")
    private Integer siteId;
//                .AddColumn("data_type").AsInt32().Nullable()
    @Column(name = "data_type")
    private Integer dataType;
//                .AddColumn("domstor_id").AsInt64().Nullable()
    @Column(name = "domstor_id")
    private Long domstorId;
//.WithColumn("loaded").AsBoolean().WithDefaultValue(false).NotNullable()
    @Column(name = "loaded", nullable = false)
    private Boolean loaded = false;
//.WithColumn("operation_id").AsInt32().WithDefaultValue(0).NotNullable()
    @Column(name = "operation_id", nullable = false)
    private Integer operationId = 0;
//.WithColumn("external_id").AsString(255).Nullable();
    @Column(name = "external_id")
    private String externalId = "";
//                .AddColumn("ad_edit_dt").AsDateTime().Nullable()
    @Column(name = "ad_edit_dt")
    private Date advertEditDt;
//    .WithColumn("version").AsInt32().WithDefaultValue(0).NotNullable();
    @Column(name = "version")
    private Integer version;
//.WithColumn("external_id").AsString(255).Nullable();
    @Column(name = "external_url")
    private String externalUrl = "";

    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "data_type",
                    referencedColumnName = "data_type",
                    updatable = false,
                    insertable = false),
            @JoinColumn(
                    name = "domstor_id",
                    referencedColumnName = "domstor_id",
                    updatable = false,
                    insertable = false)
    })
    private Advert advert;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Advert getAdvert() {
        return advert;
    }
}
