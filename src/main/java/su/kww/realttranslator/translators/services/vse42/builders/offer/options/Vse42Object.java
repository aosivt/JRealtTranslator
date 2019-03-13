package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42AdvertOffer;

public class Vse42Object {
    private Vse42Object(){}
    public static void set(ServiceAllJson serviceAllJson, Integer category, Vse42AdvertOffer offer){
        Vse42Object object = new Vse42Object();
        offer.setMasonry(object.getMasonry(serviceAllJson));
        offer.setWc(object.getWc(serviceAllJson));
        offer.setLogia(object.getLogia(serviceAllJson,category));
        offer.setRepair(object.getRepair(serviceAllJson));
        offer.setCost(object.getCost(serviceAllJson,offer.getOperation()));

        offer.setCategory(category);
        offer.setFiles(serviceAllJson.getPhotos());
        offer.setId(String.format("%s%s",serviceAllJson.getDataClass(),serviceAllJson.getId()));
        offer.setOperation(object.getOperation(serviceAllJson.isActiveSale()));

//        offer.setPhone(serviceAllJson.getContact());

    }
    private Integer getMasonry(ServiceAllJson serviceAllJson) {
        //55 Кирпич
        //76 Железобетонная панель
        //77 Пенобетон
        //78 Монолит
        //167 Дерево / Сруб
        //168 Шлакоблок
        //215 Комбинированный (Кир.+Жб/П)
        //216 Сендвич панель
        switch(serviceAllJson.getMaterialWallId()) {
            case 1035: return 55;
            case 1034: return 76;
            case 1039: return 77;
            case 1036: return 78;
            case 1038: return 167;
            case 1041: return 168;
        }
        return null;
    }

    private Integer getWc(ServiceAllJson serviceAllJson) {
        if(serviceAllJson.getToiletCount() > 1){
            return 143;
        }
        switch(serviceAllJson.getToiletId()){
            case 1424: return 131;
            case 1425: return 130;
        }
        return null;
    }

    private Integer getLogia(ServiceAllJson serviceAllJson, Integer cat) {
        if(cat.equals(AbstractBuilderAdvert.DOMSTOR_TYPE_FLAT)){
            return null;
        }

        Integer bc = serviceAllJson.getBalconyCount();
        Integer lc = serviceAllJson.getLoggiaCount();

        if(bc > 0 && lc > 0) {
            return 169; // Балкон + Лоджия
        }
        if(bc > 1) {
            return 170; // Балкон + Балкон
        }
        if (lc > 1) {
            return 171; // Лоджия + Лоджия
        }

        Boolean glass = serviceAllJson.getBalconyArrangementIds().contains(1484);

        if (bc > 0) {
            if(glass) {
                return 156; // Балкон застеклен
            }
            return 128; // Балкон
        }

        if (lc > 0) {
            if (glass) {
                return 157; // Лоджия застеклен
            }
            return 129; // Лоджия
        }
        return null;
    }

    private Integer getRepair(ServiceAllJson serviceAllJson) {
        //80 Требуется капитальный ремонт
        //82 Евроремонт
        //83 Самоотделка
        //84 Хороший ремонт
        //232 Требуется косметический ремонт
        switch(serviceAllJson.getStateId()) {
            case 1058:
            case 1057: return 80;
            case 1591: return 82;
            case 1056: return 83;
            case 1059:
            case 1590: return 84;
            case 1589: return 232;
        }
        return null;
    }

//    private String getPhone(ServiceAllJson serviceAllJson)
//    {
//        List<string> phones = aw.GetPhones(true).ToList();
//        if (phones.Count == 0)
//        {
//            throw new IterationException(false , "Can't get phone" , this.mp.WrongPhoneNumber(aw.getPhoneString())) { Level = ExceptionLevel.Info };
//        }
//        return phones.Count > 1 ? String.Join(",", phones.GetRange(0, 2)) : phones.FirstOrDefault();
//    }

    private Float getCost(ServiceAllJson serviceAllJson, String operationString)
    {
        Double priceRur = Double.valueOf(operationString.equals(BuilderVse42Advert.OPERATION_SELL )?
                            serviceAllJson.getPriceFull() : serviceAllJson.getPriceFullRur());
        if(priceRur == 0) {
            return 0F;
        }
//        return Math.round(price_rur / 1000, 2);
        return Float.valueOf(Math.round(priceRur / 1000));
    }

    private String getOperation(Boolean isSale){
        return isSale?BuilderVse42Advert.OPERATION_SELL:BuilderVse42Advert.OPERATION_LEASE;
    }
}
