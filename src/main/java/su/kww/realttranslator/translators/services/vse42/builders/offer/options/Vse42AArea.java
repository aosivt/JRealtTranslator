package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42AdvertOffer;

import java.util.Objects;

public class Vse42AArea {
    private Vse42AArea(){}
    public static void set(ServiceAllJson serviceAllJson, Integer category, Vse42AdvertOffer offer){
        Vse42AArea vse42AArea = new Vse42AArea();
        offer.setArea(vse42AArea.getArea(serviceAllJson, category));
        offer.setLivingArea(vse42AArea.getLivingArea(serviceAllJson));
        offer.setKitchenArea(vse42AArea.getKitchenArea(serviceAllJson));
    }
    private Float getArea(ServiceAllJson serviceAllJson, Integer cat) {
        Integer area = cat.equals(BuilderVse42Advert.CAT_COMMERCE) ?
                serviceAllJson.getSquareHouseMin() : serviceAllJson.getSquareHouse();
        if (area == 0) {
            return null;
        }
        return Float.valueOf(area);
    }

    private Float getKitchenArea(ServiceAllJson serviceAllJson) {
        Integer area = serviceAllJson.getSquareKitchen();
        if (area == 0) {
            return null;
        }
        return Float.valueOf(area);
    }

    private Float getLivingArea(ServiceAllJson serviceAllJson) {
        Integer area = serviceAllJson.getSquareLiving();
        if (area == 0) {
            return null;
        }
        return Float.valueOf(area);
    }
}
