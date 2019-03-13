package su.kww.realttranslator.core.api.inside.database.entities.identifiers;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdvertSiteId implements Serializable {

//    @Column(name = "data_type", nullable = false)
    private Integer dataType;

//    @Column(name = "domstor_id", nullable = false)
    private Long domstorId;

//    @Column(name = "site_id",nullable = false)
    private Integer siteId;

    public AdvertSiteId() {}

    public AdvertSiteId(Integer dataType,Integer siteId, Long domstorId) {
        this.dataType = dataType;
        this.domstorId = domstorId;
        this.siteId = siteId;
    }

    public Integer getSiteId() {
        return siteId;
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

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdvertSiteId)) return false;
        AdvertSiteId that = (AdvertSiteId) o;
        return Objects.equals(getDataType() , that.getDataType()) &&
               Objects.equals(getSiteId()   , that.getSiteId()) &&
               Objects.equals(getDomstorId(), that.getDomstorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataType(), getDomstorId(), getSiteId());
    }
}
