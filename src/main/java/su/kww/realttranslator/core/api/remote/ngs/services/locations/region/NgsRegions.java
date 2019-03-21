package su.kww.realttranslator.core.api.remote.ngs.services.locations.region;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class NgsRegions {

    @Inject
    public NgsRegions(){}

    private final Map<String, NgsRegionItem> regions = new HashMap<String, NgsRegionItem>() {
    {
        put("Кемеровская", new NgsRegionItem(42, "kemerovo.n1.ru", "https://kemerovo.n1.ru/cp/"));
        put("Новосибирская", new NgsRegionItem(54, "novosibirsk.n1.ru", "https://novosibirsk.n1.ru/cp/"));
        put("Красноярский", new NgsRegionItem(24, "krasnoyarsk.n1.ru", "https://gilcom.ru/cp/"));
        put("Омская", new NgsRegionItem(55, "omsk.n1.ru", "https://realty.ngs55.ru/cp/"));
        put("Алтайский", new NgsRegionItem(22, "barnaul.n1.ru", "https://barnaul.n1.ru/cp/"));
        put("Томская", new NgsRegionItem(70, "tomsk.n1.ru", "https://realty.ngs70.ru/cp/"));
        put("Иркутская", new NgsRegionItem(38, "irkutsk.n1.ru", "https://realty.ngs38.ru/cp/"));
        put("Свердловская", new NgsRegionItem(66, "ekaterinburg.n1.ru", "https://realty.e1.ru/cp/"));
        put("Пермский", new NgsRegionItem(59, "perm.n1.ru", "https://perm.n1.ru/cp/"));
        put("Сочи", new NgsRegionItem(93, "sochi.n1.ru", "https://sochi.n1.ru/cp/"));
        put("Краснодарский", new NgsRegionItem(23, "krasnodar.n1.ru", "https://krasnodar.n1.ru/cp/"));
        put("Самарская", new NgsRegionItem(63, "samara.n1.ru", "https://samara.n1.ru/cp/"));
        put("Ростовская", new NgsRegionItem(61, "rostov.n1.ru", "https://rostov.n1.ru/cp/"));
        put("Нижегородская", new NgsRegionItem(52, "nizhniy-novgorod.n1.ru", "https://nizhniy-novgorod.n1.ru/cp/"));
    }
    };

    public Map<String, NgsRegionItem> getRegions() {
        return regions;
    }
}
