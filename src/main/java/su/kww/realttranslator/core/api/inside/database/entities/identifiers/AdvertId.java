package su.kww.realttranslator.core.api.inside.database.entities.identifiers;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AdvertId implements Serializable {
    private Integer dataType;
    private Long domstorId;

    public AdvertId() {}

    public AdvertId(Integer dataType, Long domstorId) {
        this.dataType = dataType;
        this.domstorId = domstorId;
    }
}
