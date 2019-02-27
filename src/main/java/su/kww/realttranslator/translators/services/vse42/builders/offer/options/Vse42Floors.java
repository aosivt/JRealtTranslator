package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42AdvertOffer;

public class Vse42Floors {
    private Vse42Floors(){}

    public static void set(ServiceAllJson allJson, Integer cat, Vse42AdvertOffer offer){
        Vse42Floors vse42Floors = new Vse42Floors();
        offer.setFloor(vse42Floors.getFloor(allJson, cat));
        offer.setFloorMax(vse42Floors.getFloorMax(allJson, cat));
    }

    private Integer getFloor(ServiceAllJson allJson, Integer cat){
        Integer floor = cat.equals(BuilderVse42Advert.CAT_COMMERCE)?
                        allJson.getObjectFloorMin() : allJson.getObject_floor();
        if (floor == 0){
            return null;
        }
        return floor;
    }
    private Integer getFloorMax(ServiceAllJson allJson, Integer cat){
        Integer floor = allJson.getBuilding_floor();
        if (floor == 0) {
            return null;
        }
        return floor;
    }
}
