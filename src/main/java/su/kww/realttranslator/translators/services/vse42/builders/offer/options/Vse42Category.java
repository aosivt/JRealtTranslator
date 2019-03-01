package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;

import java.util.HashMap;
import java.util.Map;

public class Vse42Category {


    private final Map<Integer,Integer> TYPE_COLLECTION = getMapType();

    public static Integer get(ServiceAllJson allJson) {
        Vse42Category builder = new Vse42Category();
        Integer type = builder.getIntegerTypeVse42Object(allJson.getDataClass());
        builder.fieldIfFlat(type,allJson);
        builder.fieldIfLand(type,allJson);

        return type;
    }

    private void fieldIfLand(Integer type,ServiceAllJson allJson) {
        if (type.equals(BuilderVse42Advert.DOMSTOR_TYPE_LAND)) { //aw.GetInt("land_type_id") == 1461
            type = BuilderVse42Advert.CAT_HOUSE;
        } else {
//            Integer flatTypeId = allJson.getFlat_type_id();
//            if (flatTypeId == 1598 || flatTypeId == 1599 || flatTypeId == 1600 || flatTypeId == 1247 || allJson.getIn_communal()){
//                type = BuilderVse42Advert.CAT_ROOM;
//            }
//            type = BuilderVse42Advert.CAT_FLAT;
//            throw new IterationException(false, "Can't define category", "Для размещения доступны только земельные участки с типом \"Дача\"");
        }
    }

    private void fieldIfFlat(Integer type,ServiceAllJson allJson){
        if (allJson.isNewBuilding() && type.equals(BuilderVse42Advert.CAT_FLAT)) {
            type = BuilderVse42Advert.CAT_NEW;
        } else {
            Integer flatTypeId = allJson.getFlatTypeId();
            if (flatTypeId == 1598 || flatTypeId == 1599 || flatTypeId == 1600 || flatTypeId == 1247 || allJson.isInCommunal()){
                type = BuilderVse42Advert.CAT_ROOM;
            }
            type = BuilderVse42Advert.CAT_FLAT;
        }
    }

    private Integer getIntegerTypeVse42Object(final Integer typeObject){
        return TYPE_COLLECTION.entrySet()
//                .parallelStream()
                .stream()
                .filter(f->f.getKey().equals(typeObject))
                .findFirst().orElse(null).getValue();
    }

    private HashMap<Integer, Integer> getMapType(){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(BuilderVse42Advert.DOMSTOR_TYPE_COMMERCE,BuilderVse42Advert.CAT_COMMERCE);
        map.put(BuilderVse42Advert.DOMSTOR_TYPE_GARAGE,BuilderVse42Advert.CAT_GARAGE);
        map.put(BuilderVse42Advert.DOMSTOR_TYPE_LAND,BuilderVse42Advert.CAT_HOUSE);
        map.put(BuilderVse42Advert.DOMSTOR_TYPE_HOUSE,BuilderVse42Advert.CAT_HOUSE);
        map.put(BuilderVse42Advert.DOMSTOR_TYPE_FLAT,BuilderVse42Advert.CAT_FLAT);
        return map;
    }
}
