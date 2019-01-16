package su.kww.realttranslator.translators.service.yandex.offer.builders;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.service.yandex.offer.*;
import su.kww.realttranslator.translators.service.yandex.offer.builders.offer.BuilderYandexAdvertOffer;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class BuilderYandexAdvert extends AbstractBuilderAdvert {

    private final HashMap<Integer,BuilderYandexAdvertOffer> mapOfferType = getMapType();

    private BuilderYandexAdvert(){}

    public static YandexAdvert build(Set<AdvertSite> advertSites){

        BuilderYandexAdvert builderYandexAdvert = new BuilderYandexAdvert();

        Set<YandexAdvertOffer> yandexAdvertOffers = advertSites
                .parallelStream()
                .filter(builderYandexAdvert::isNotDeleteProcess)
                .map(builderYandexAdvert::buildAdvertOffer)
                .collect(Collectors.toSet());

        YandexAdvert yandexAdvert = new YandexAdvert();
        yandexAdvert.setOffer(yandexAdvertOffers);

        return yandexAdvert;
    }

    public YandexAdvertOffer buildAdvertOffer(final AdvertSite advertSite){
        ServiceAllJson serviceAllJson = getServiceAllJsonByAdvertSite(advertSite);
        YandexAdvertOffer yandexAdvertOffer = getYandexAdvertOffer(advertSite);
        yandexAdvertOffer.setId(getId(serviceAllJson));
        setFloor(serviceAllJson,yandexAdvertOffer)
        .setPrice(serviceAllJson,yandexAdvertOffer)
        .setLocation(serviceAllJson,yandexAdvertOffer)
        .setSalesAgent(serviceAllJson,yandexAdvertOffer)
        ;
        return yandexAdvertOffer;
    }

    protected BuilderYandexAdvert setFloor(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        if (Objects.nonNull(serviceAllJson.getObject_floor())) {
            yandexAdvertOffer.setFloor(Integer.parseInt(serviceAllJson.getObject_floor()));
        }
        return this;
    }
    protected BuilderYandexAdvert setPrice(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        if (Objects.nonNull(serviceAllJson.getPrice_currency())) {
            yandexAdvertOffer.setPrice(toPrice(serviceAllJson));
        }
        return this;
    }
    protected BuilderYandexAdvert setLocation(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        if (Objects.nonNull(serviceAllJson)) {
            Location location = new Location();
            location.setLocalityName(serviceAllJson.getCity().getName());
            location.setLongitude((String)serviceAllJson.getLongitude());
            location.setLatitude((String)serviceAllJson.getLatitude());
            yandexAdvertOffer.setLocation(location);
        }
        return this;
    }
    protected BuilderYandexAdvert setSalesAgent(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        SalesAgent salesAgent = new SalesAgent();
        salesAgent.setName((String)serviceAllJson.getAgent_name());
        yandexAdvertOffer.setSalesAgent(salesAgent);
        return this;
    }


    protected Price toPrice(ServiceAllJson serviceAllJson){
        Price price = new Price();
        price.setCurrency(serviceAllJson.getPrice_currency().getName());
        price.setValue(serviceAllJson.getPrice_full());
        return price;
    }

    protected YandexAdvertOffer getYandexAdvertOffer(final AdvertSite advertSite){
        return mapOfferType.get(advertSite.getDataType()).getYandexAdvertOffer();
    }

    private static HashMap<Integer,BuilderYandexAdvertOffer> getMapType(){
        HashMap<Integer,BuilderYandexAdvertOffer> map = new HashMap<>();
        map.put(1,BuilderYandexAdvertOffer.COMMERCE);
        map.put(3,BuilderYandexAdvertOffer.FLAT);
        map.put(2,BuilderYandexAdvertOffer.GARAGE);
        map.put(7,BuilderYandexAdvertOffer.HOUSE);
        map.put(9,BuilderYandexAdvertOffer.LAND);
        return map;
    }

}
