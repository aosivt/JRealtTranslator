package su.kww.realttranslator.translators.service.yandex.offer.builders.offer;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.service.yandex.offer.*;
import su.kww.realttranslator.translators.service.yandex.offer.builders.offer.options.*;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public enum BuilderYandexAdvertOffer {

    FLAT{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer() {
            return new FlatYandexAdvertOffer();
        }
    },HOUSE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer() {
            return new HouseYandexAdvertOffer();
        }
    },COMMERCE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer() {
            return new CommerceYandexAdvertOffer();
        }
    },LAND{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer() {
            return new LandYandexAdvertOffer();
        }
    },GARAGE{
        @Override
        public YandexAdvertOffer getYandexAdvertOffer() {
            return new GarageYandexAdvertOffer();
        }
    };

    public abstract YandexAdvertOffer getYandexAdvertOffer();
}
