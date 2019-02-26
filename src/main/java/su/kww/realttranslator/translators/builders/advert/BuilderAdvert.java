package su.kww.realttranslator.translators.builders.advert;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.service.yandex.offer.YandexAdvertOffer;

public interface BuilderAdvert {
    public abstract AdvertOffer buildAdvertOffer(AdvertSite advertSite);
}
