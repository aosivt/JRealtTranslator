package su.kww.realttranslator.translators.services.yandex.offer.builders;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdverts;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;
import su.kww.realttranslator.translators.services.yandex.offer.*;
import su.kww.realttranslator.translators.services.yandex.offer.builders.offer.BuilderYandexAdvertOffer;

import java.util.*;
import java.util.stream.Collectors;

public class BuilderYandexAdvert extends AbstractBuilderAdvert {

    private final HashMap<Integer,BuilderYandexAdvertOffer> mapOfferType = getMapType();

    protected final static String ADDRESS_FORMAT_STRING = "%s %s, %s%s";

    protected final static String UNIT_SQUARE_M2 = "кв.м";
    protected final static String UNIT_SQUARE_100 = "cотка";

    protected final static String PRICE_UNIT_RUR = "RUR";

    private BuilderYandexAdvert(){}

    public static YandexAdvert build(Set<AdvertSite> advertSites){

        BuilderYandexAdvert builderYandexAdvert = new BuilderYandexAdvert();

        Set<YandexAdvertOffer> yandexAdvertOffers = advertSites
//                .parallelStream()
                .stream()
                .filter(builderYandexAdvert::isNotDeleteProcess)
                .filter(f-> Objects.nonNull(RepositoryAdverts.getById(f.getDataType(),f.getDomstorId())))
                .map(advertSite-> (YandexAdvertOffer)builderYandexAdvert.buildAdvertOffer(advertSite))
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());

        YandexAdvert yandexAdvert = new YandexAdvert();
        yandexAdvert.setOffer(yandexAdvertOffers);

        return yandexAdvert;
    }

    public AdvertOffer buildAdvertOffer(final AdvertSite advertSite){

        YandexAdvertOffer yandexAdvertOffer = null;
        try{
            ServiceAllJson serviceAllJson = getServiceAllJsonByAdvertSite(advertSite);
            yandexAdvertOffer = getYandexAdvertOffer(advertSite);
            yandexAdvertOffer.setId(getId(serviceAllJson));
            yandexAdvertOffer.setCreationDate(serviceAllJson.getRegDt());
            yandexAdvertOffer.setLastUpdateDate(serviceAllJson.getEditDt());
            yandexAdvertOffer.setUrl(serviceAllJson.getLink());
            yandexAdvertOffer.setDescription(serviceAllJson.getNoteWeb());
            yandexAdvertOffer.setMortgage(serviceAllJson.getMortgage());
            setFloors(serviceAllJson,yandexAdvertOffer)
                    .setAreas(serviceAllJson,yandexAdvertOffer)
                    .setPrice(serviceAllJson,yandexAdvertOffer)
                    .setLocation(serviceAllJson,yandexAdvertOffer)
                    .setSalesAgent(serviceAllJson,yandexAdvertOffer)
                    .setPhotos(serviceAllJson,yandexAdvertOffer)
            ;
        } catch (NullPointerException e){

        }
        return yandexAdvertOffer;
    }

    protected BuilderYandexAdvert setFloors(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        yandexAdvertOffer.setFloor(serviceAllJson.getObjectFloor());
        yandexAdvertOffer.setFloorsTotal(serviceAllJson.getBuildingFloor());
        return this;
    }

    protected BuilderYandexAdvert setPhotos(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        yandexAdvertOffer.setPhotos(serviceAllJson.getPhotos());
        return this;
    }
    protected BuilderYandexAdvert setPrice(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        if (Objects.nonNull(serviceAllJson.getPriceCurrency())) {
            yandexAdvertOffer.setPrice(toPrice(serviceAllJson));
        }
        return this;
    }
    protected BuilderYandexAdvert setLocation(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        if (Objects.nonNull(serviceAllJson)) {
            Location location = new Location();
            location.setRegion(serviceAllJson.getRegion().getName());
            location.setLocalityName(serviceAllJson.getCity().getName());
            location.setSubLocalityName(serviceAllJson.getDistrict().getName());
            location.setAddress(getAddress(serviceAllJson));
            location.setLongitude(serviceAllJson.getLongitude());
            location.setLatitude(serviceAllJson.getLatitude());
            yandexAdvertOffer.setLocation(location);
        }
        return this;
    }

    protected BuilderYandexAdvert setAreas(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        yandexAdvertOffer.setArea(getArea(serviceAllJson.getSquareHouse().toString(),UNIT_SQUARE_M2));
        yandexAdvertOffer.setKitchenSpace(getArea(serviceAllJson.getSquareKitchen().toString(),UNIT_SQUARE_M2));
        yandexAdvertOffer.setLivingSpace(getArea(serviceAllJson.getSquareLiving().toString(),UNIT_SQUARE_M2));

        return this;
    }
    protected Area getArea(String value, String unit){
        if (value.equals("0")) return null;
        return new Area(value,unit);
    }

    protected String getAddress(ServiceAllJson serviceAllJson){
        return String.format(ADDRESS_FORMAT_STRING, serviceAllJson.getStreet().getAbbr(),
                                                    serviceAllJson.getStreet().getName(),
                                                    serviceAllJson.getBuildingNum(),
                                                    serviceAllJson.getCorpus());
    }

    protected BuilderYandexAdvert setSalesAgent(ServiceAllJson serviceAllJson, final YandexAdvertOffer yandexAdvertOffer){
        SalesAgent salesAgent = new SalesAgent();
        salesAgent.setName((String)serviceAllJson.getAgentName());
        salesAgent.setPhone(getPhones(serviceAllJson.getAgentPhone()));
        salesAgent.setEmail(serviceAllJson.getAgent().getEmail());
        salesAgent.setOrganization(serviceAllJson.getOrg().getName());
        salesAgent.setAgencyId(serviceAllJson.getOrg().getId());
        yandexAdvertOffer.setSalesAgent(salesAgent);
        return this;
    }

    private Set<String> getPhones(String textString){
        return Arrays.asList(textString.split(","))
//                .parallelStream()
                .stream()
                .collect(Collectors.toSet());
    }


    protected Price toPrice(ServiceAllJson serviceAllJson){
        Price price = new Price();
        price.setCurrency(PRICE_UNIT_RUR);
        price.setValue(serviceAllJson.getPriceFull());
        return price;
    }

    protected YandexAdvertOffer getYandexAdvertOffer(final AdvertSite advertSite){
        return mapOfferType.get(advertSite.getDataType()).getYandexAdvertOffer(advertSite);
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
