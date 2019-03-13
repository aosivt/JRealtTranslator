package su.kww.realttranslator.core.api.inside.database.entities;

import org.hibernate.annotations.GeneratorType;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "advert_site")
//@IdClass(AdvertSiteId.class)
public class AdvertSiteUpdate implements EntityDomstor {

//    @EmbeddedId
//    private AdvertSiteId id;
//
//.WithColumn("site_id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "site_id",nullable = false)
//    @GeneratedValue(generator = "native")
    private Integer siteId;
//                .AddColumn("data_type").AsInt32().Nullable()
    @Id
    @Column(name = "data_type",nullable = false)
//    @GeneratedValue(generator = "native")
    private Integer dataType;
//                .AddColumn("domstor_id").AsInt64().Nullable()
    @Id
    @Column(name = "domstor_id",nullable = false)
//    @GeneratedValue(generator = "native")
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



//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumns({
//            @JoinColumn(name="data_type", referencedColumnName="data_type", insertable = false, updatable = false),
//            @JoinColumn(name="domstor_id", referencedColumnName="domstor_id", insertable = false, updatable = false)
//    })
    @Transient
    private Advert advert;


    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }
//
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
