package su.kww.realttranslator.core.api.inside.database.entities;


import org.hibernate.annotations.Immutable;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Immutable
@Table(name = "advert_site")
public class AdvertSiteAdvert extends AdvertSite{

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumns({
            @JoinColumn(name="data_type", referencedColumnName="data_type", insertable = false, updatable = false),
            @JoinColumn(name="domstor_id", referencedColumnName="domstor_id", insertable = false, updatable = false)
    })
    private Advert advert;

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }
}
