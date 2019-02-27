package su.kww.realttranslator.translators.builders.advert;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;

public interface BuilderAdvert {
    public abstract AdvertOffer buildAdvertOffer(AdvertSite advertSite);
}
