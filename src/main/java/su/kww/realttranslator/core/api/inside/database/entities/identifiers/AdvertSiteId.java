package su.kww.realttranslator.core.api.inside.database.entities.identifiers;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AdvertSiteId implements Serializable {
    private Integer dataType;
    private Integer siteId;
    private Long domstorId;

    public AdvertSiteId() {}

    public AdvertSiteId(Integer dataType,Integer siteId, Long domstorId) {
        this.dataType = dataType;
        this.domstorId = domstorId;
        this.siteId = siteId;
    }
}
