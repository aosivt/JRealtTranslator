package su.kww.realttranslator.core.api.inside.database.entities.identifiers;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdvertId implements Serializable{


    @Column(name = "data_type", nullable = false)
    protected Integer dataType;
    @Column(name = "domstor_id", nullable = false)
    protected Long domstorId;

    public AdvertId() {}

    public AdvertId(Integer dataType, Long domstorId) {
        this.dataType = dataType;
        this.domstorId = domstorId;
    }

    public Integer getDataType() {
        return dataType;
    }

    public Long getDomstorId() {
        return domstorId;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setDomstorId(Long domstorId) {
        this.domstorId = domstorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdvertId)) return false;
        AdvertId that = (AdvertId) o;
        return Objects.equals(getDataType(), that.getDataType()) &&
               Objects.equals(getDomstorId(), that.getDomstorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataType(), getDomstorId());
    }
}
