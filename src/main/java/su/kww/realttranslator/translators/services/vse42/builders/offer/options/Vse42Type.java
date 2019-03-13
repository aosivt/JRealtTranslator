package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;

import java.util.List;
import java.util.Set;

public class Vse42Type {
    private Vse42Type(){}

    public static String get(ServiceAllJson allJson, Integer cat){
        Vse42Type vse42Type = new Vse42Type();
        String temp =  null;
        try {
            temp = vse42Type.getTypes(allJson, cat);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

    private String getTypes(ServiceAllJson allJson, Integer cat) throws Exception {
        if (cat.equals(BuilderVse42Advert.CAT_NEW)){
            switch (allJson.getFlatTypeId())
            {
                case 1255: //  Элитная
                    return "161"; // элитная

                case 1479: // Комфорт-класс
                case 1254: // Бизнес-класс
                    return "162"; // повышенной комфортности

                case 1252: // Улучшенной планировки
                    return "163"; // Улучшенной планировки

                case 1253: // Эконом-класс
                    return "259"; //эконом класса

                default:
                    return "213"; // по социальным нормам
            }
        } else if(cat.equals(BuilderVse42Advert.CAT_FLAT)){
            switch (allJson.getFlatTypeId())
            {
                case 1248: // Полублагоустроенная (барак)
                    return "115"; // в полублагоустроеном доме (барак)

                case 1249: // Хрущевка
                    return "116"; // в хрущевке

                case 1479: // Комфорт-класс
                case 1254: // Бизнес-класс
                    return "117"; // в доме повышенной комфортности

                case 1250: // Полнометражная (сталинка)
                    return "165"; // полнометражная

                case 1255: // Элитная
                    return "166"; // в элитном доме

                default:
                    return "114"; // в доме улучшенной планировки
            }
        } else if(cat.equals(BuilderVse42Advert.CAT_ROOM)){
            return "kgt";
        } else if(cat.equals(BuilderVse42Advert.CAT_HOUSE)){
            switch(allJson.getHouseTypeId())
            {
                case 1365:
                    return "140"; // Коттедж

                case 1366:
                    return "217"; // Таунхаус

                default:
                    return "139"; // Дом
            }
        } else if(cat.equals(BuilderVse42Advert.CAT_GARAGE)){
            switch (allJson.getGarageTypeId())
            {
                case 1426:
                    return "153"; // капитальный гараж

                case 1427:
                    return "154"; // металлический гараж

                case 1428:
                case 1430:
                    return "150"; // Парковка

                default:
                    return "149"; // Гараж
            }
        } else if(cat.equals(BuilderVse42Advert.CAT_COMMERCE)){
            Set<Integer> purposes = allJson.getPurposeIds();

            if (allJson.withBusiness()) {
                return "253"; // Действующий бизнес
            }

            if(purposes.contains(1002)) {
                return "250"; // Торговое
            }

            if(purposes.contains(1003)) {
                return "251"; // Офисное
            }

            if (purposes.contains(1005) || purposes.contains(1006)) {
                return "252"; // Производственно-складское
            }

            return "255"; // Другое
        }
        throw new Exception("Unknown category");
    }
}
