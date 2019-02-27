package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;

import java.util.Objects;

public class Vse42Address {
    private Vse42Address(){}
    public static String get(ServiceAllJson serviceAllJson, Integer category){
        String street = serviceAllJson.getStreet().getName();
        if(Objects.isNull(street)) {
            if (category.equals(BuilderVse42Advert.CAT_GARAGE) || category.equals(BuilderVse42Advert.CAT_HOUSE)){
                return null;
            }
//            throw new IterationException(false, "Street not defined", this.mp.EmptyStreet())
//            {
//                Level = ExceptionLevel.Info
//            };
        }

        String abbr = serviceAllJson.getStreet().getAbbr();
        String house = serviceAllJson.getBuilding_num().toString();
        return (abbr == null ? "" : abbr + ". ") + street + (house == null? "" : ", " + house);
    }
}
