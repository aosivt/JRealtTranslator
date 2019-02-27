package su.kww.realttranslator.translators.services.yandex.offer.builders.offer;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.services.yandex.offer.*;
import su.kww.realttranslator.translators.services.yandex.offer.builders.offer.options.*;


public enum BuilderYandexAdvertOffer {

    FLAT{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite) {

            return new FlatYandexAdvertOffer();
        }
    },HOUSE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite) {
            return new HouseYandexAdvertOffer();
        }
    },COMMERCE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite) {
            return new CommerceYandexAdvertOffer();
        }
    },LAND{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite) {
            return new LandYandexAdvertOffer();
        }
    },GARAGE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite) {
            return new GarageYandexAdvertOffer();
        }
    };

    public abstract YandexAdvertOffer getYandexAdvertOffer(AdvertSite advertSite);
}
