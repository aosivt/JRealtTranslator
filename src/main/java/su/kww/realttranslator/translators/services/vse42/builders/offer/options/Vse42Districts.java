package su.kww.realttranslator.translators.services.vse42.builders.offer.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Vse42Districts {

    private final Map<Integer,String> DISTRICT_COLLECTION = buildDistrictCollection();
    public static Integer get(ServiceAllJson allJson, Integer cat){
        Vse42Districts dist = new Vse42Districts();

        Integer district_id = allJson.getDistrict_id();

        if (district_id == 1330) {
            return 21;
        }

        String district = allJson.getDistrict().getName();
        if ( district == null ) {
            return null;
         }
        Map.Entry founded = dist.getDistrictByName(district);

        if (founded == null) {
            if (cat.equals(BuilderVse42Advert.CAT_GARAGE) || cat.equals(BuilderVse42Advert.CAT_HOUSE)) {
                return null;
            }
            String parentDist = allJson.getParent_district().getName();
            if (!Objects.isNull(parentDist)) {
                founded = dist.getDistrictByName(parentDist);
            }
            if (founded == null) {
                return null;
            }
        }
        return (Integer)founded.getKey();
    }

    private Map.Entry getDistrictByName(final String nameDistrict){
        return DISTRICT_COLLECTION.entrySet()
                .parallelStream().filter(f->f.getValue().equals(nameDistrict))
                .findFirst().orElse(null);
    }



    private Map<Integer,String> buildDistrictCollection(){
        Map<Integer,String> districts = new HashMap<>();
        districts.put(17, "Заводский");
        districts.put(18, "Кировский");
        districts.put(19, "Ленинский");
        districts.put(20, "Рудничный");
        districts.put(21, "Центральный");
        districts.put(22, "ФПК");
        districts.put(23, "Южный");
        districts.put(24, "п. Геологоразведка");
        districts.put(25, "п. Пионер");
        districts.put(26, "п. Комиссарово");
        districts.put(27, "д. Плешки");
        districts.put(28, "п. Ягуновский");
        districts.put(29, "Плодопитомник");
        districts.put(30, "ш. Бутовская");
        districts.put(31, "Заря");
        districts.put(32, "Металлплощадка");
        districts.put(33, "Сухово");
        districts.put(34, "Шалготарьян");
        districts.put(35, "д. Красная");
        districts.put(36, "Ягуновка");
        districts.put(37, "Лесная поляна");
        districts.put(38, "Радуга");
        districts.put(39, "Кедровка");
        districts.put(40, "ш. Волкова");
        districts.put(41, "ш. Северная");
        districts.put(42, "Кардиоцентр");
        districts.put(44, "Кемерово-Сити");
        districts.put(46, "РТС");
        districts.put(47, "п. Предзаводской");
        districts.put(48, "Янтарный");
        districts.put(49, "Эдельвейс");
        districts.put(50, "Южная звезда");
        districts.put(51, "Серебряные ручьи");
        districts.put(52, "Флагман");
        districts.put(53, "Изумрудная долина");
        districts.put(54, "Парус");
        districts.put(55, "Зеленая околица");
        districts.put(56, "Зеленый остров");
        districts.put(57, "Маленькая италия");
        districts.put(58, "Серебряный бор");
        districts.put(59, "Каравелла");
        districts.put(60, "Золотые купола");
        districts.put(63, "Мегаполис");
        districts.put(64, "Пять звезд");
        districts.put(65, "На Космической");
        districts.put(66, "Планета ФПК");
        districts.put(67, "Родные берега");
        districts.put(68, "Раздолье");
        districts.put(69, "Молодежный");
        districts.put(70, "Жемчужина");
        districts.put(71, "Слобода");
        districts.put(72, "Квадро");
        districts.put(73, "Созвездие");
        districts.put(74, "Солнечная горка");
        districts.put(75, "Томский причал");
        districts.put(93, "Крылья");
        districts.put(92, "Семейный");
        districts.put(91, "Родные просторы");
        districts.put(90, "Березовая роща");
        districts.put(89, "Притомский");
        districts.put(88, "Big Star");
        districts.put(87, "Прогресс");
        districts.put(86, "Европейские Провинции");
        districts.put(85, "Молодежный 2.0");
        districts.put(82, "Лесная сказка");
        districts.put(81, "12-ый микрорайон");
        districts.put(80, "Дипломат");
        districts.put(79, "Правобережный");
        districts.put(78, "Радужный");
        districts.put(77, "Сибирская станица");
        districts.put(76, "Юность");
        return districts;
    }
}
