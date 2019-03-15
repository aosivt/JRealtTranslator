package su.kww.realttranslator.translators.services.avito.offer.builders;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;
import su.kww.realttranslator.translators.services.avito.offer.*;
import su.kww.realttranslator.translators.services.avito.offer.builders.offer.BuilderAvitoAdvertOffer;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class BuilderAvitoAdvert extends AbstractBuilderAdvert {

    private final HashMap<Integer, BuilderAvitoAdvertOffer> mapOfferType = getMapType();

    protected final static String ADDRESS_FORMAT_STRING = "%s %s, %s %s";

    protected final static String UNIT_SQUARE_M2 = "кв.м";
    protected final static String UNIT_SQUARE_100 = "cотка";

    protected final static String PRICE_UNIT_RUR = "RUR";

    private BuilderAvitoAdvert(){}

    public static AvitoAdvert build(Set<AdvertSite> advertSites){

        BuilderAvitoAdvert builderAvitoAdvert = new BuilderAvitoAdvert();

        Set<AvitoAdvertOffer> avitoAdvertOffers = advertSites
                .parallelStream()
                .filter(builderAvitoAdvert::isNotDeleteProcess)
                .map(advertSite-> (AvitoAdvertOffer) builderAvitoAdvert.buildAdvertOffer(advertSite))
                .collect(Collectors.toSet());

        AvitoAdvert avitoAdvert = new AvitoAdvert();
        avitoAdvert.setOffer(avitoAdvertOffers);

        return avitoAdvert;
    }

    public AdvertOffer buildAdvertOffer(final AdvertSite advertSite){
        ServiceAllJson serviceAllJson = getServiceAllJsonByAdvertSite(advertSite);
        AvitoAdvertOffer avitoAdvertOffer = getAvitoAdvertOffer(advertSite);
        avitoAdvertOffer.setId(getId(serviceAllJson));
        avitoAdvertOffer.setDateBegin(serviceAllJson.getRegDt());
        avitoAdvertOffer.setDateEnd(Date.valueOf(serviceAllJson.getEditDt().toLocalDate().plusMonths(2)));
        avitoAdvertOffer.setDescription(serviceAllJson.getNoteWeb());
//        avitoAdvertOffer.setUrl(serviceAllJson.getLink());

//        avitoAdvertOffer.setMortgage(serviceAllJson.getMortgage());
//        setFloors(serviceAllJson, avitoAdvertOffer)
//        .setAreas(serviceAllJson, avitoAdvertOffer)
//        .setPrice(serviceAllJson, avitoAdvertOffer)
//        .setLocation(serviceAllJson, avitoAdvertOffer)
//        .setSalesAgent(serviceAllJson, avitoAdvertOffer)
//        .setPhotos(serviceAllJson, avitoAdvertOffer)
//        ;
        return avitoAdvertOffer;
    }

//    protected BuilderAvitoAdvert setFloors(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        avitoAdvertOffer.setFloor(serviceAllJson.getObjectFloor());
//        avitoAdvertOffer.setFloorsTotal(serviceAllJson.getBuildingFloor());
//        return this;
//    }

//    protected BuilderAvitoAdvert setPhotos(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        avitoAdvertOffer.setPhotos(serviceAllJson.getPhotos());
//        return this;
//    }
//    protected BuilderAvitoAdvert setPrice(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        if (Objects.nonNull(serviceAllJson.getPriceCurrency())) {
//            avitoAdvertOffer.setPrice(toPrice(serviceAllJson));
//        }
//        return this;
//    }
//    protected BuilderAvitoAdvert setLocation(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        if (Objects.nonNull(serviceAllJson)) {
//            Location location = new Location();
//            location.setRegion(serviceAllJson.getRegion().getName());
//            location.setLocalityName(serviceAllJson.getCity().getName());
//            location.setSubLocalityName(serviceAllJson.getDistrict().getName());
//            location.setAddress(getAddress(serviceAllJson));
//            location.setLongitude(serviceAllJson.getLongitude());
//            location.setLatitude(serviceAllJson.getLatitude());
//            avitoAdvertOffer.setLocation(location);
//        }
//        return this;
//    }
//
//    protected BuilderAvitoAdvert setAreas(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        avitoAdvertOffer.setArea(getArea(serviceAllJson.getSquareHouse().toString(),UNIT_SQUARE_M2));
//        avitoAdvertOffer.setKitchenSpace(getArea(serviceAllJson.getSquareKitchen().toString(),UNIT_SQUARE_M2));
//        avitoAdvertOffer.setLivingSpace(getArea(serviceAllJson.getSquareLiving().toString(),UNIT_SQUARE_M2));
//
//        return this;
//    }
//    protected Area getArea(String value, String unit){
//        if (value.equals("0")) return null;
//        return new Area(value,unit);
//    }

    protected String getAddress(ServiceAllJson serviceAllJson){
        return String.format(ADDRESS_FORMAT_STRING, serviceAllJson.getStreet().getAbbr(),
                                                    serviceAllJson.getStreet().getName(),
                                                    serviceAllJson.getBuildingNum(),
                                                    serviceAllJson.getCorpus());
    }

//    protected BuilderAvitoAdvert setSalesAgent(ServiceAllJson serviceAllJson, final AvitoAdvertOffer avitoAdvertOffer){
//        SalesAgent salesAgent = new SalesAgent();
//        salesAgent.setName((String)serviceAllJson.getAgentName());
//        salesAgent.setPhone(getPhones(serviceAllJson.getAgentPhone()));
//        salesAgent.setEmail(serviceAllJson.getAgent().getEmail());
//        salesAgent.setOrganization(serviceAllJson.getOrg().getName());
//        salesAgent.setAgencyId(serviceAllJson.getOrg().getId());
//        avitoAdvertOffer.setSalesAgent(salesAgent);
//        return this;
//    }
//
    private Set<String> getPhones(String textString){
        return Arrays.asList(textString.split(",")).parallelStream().filter(Objects::isNull).collect(Collectors.toSet());
    }


//    protected Price toPrice(ServiceAllJson serviceAllJson){
//        Price price = new Price();
//        price.setCurrency(PRICE_UNIT_RUR);
//        price.setValue(serviceAllJson.getPriceFull());
//        return price;
//    }

    protected AvitoAdvertOffer getAvitoAdvertOffer(final AdvertSite advertSite){
        return mapOfferType.get(advertSite.getDataType()).getAvitoAdvertOffer(advertSite);
    }

    private static HashMap<Integer, BuilderAvitoAdvertOffer> getMapType(){
        HashMap<Integer, BuilderAvitoAdvertOffer> map = new HashMap<>();
        map.put(1, BuilderAvitoAdvertOffer.COMMERCE);
        map.put(3, BuilderAvitoAdvertOffer.FLAT);
        map.put(2, BuilderAvitoAdvertOffer.GARAGE);
        map.put(7, BuilderAvitoAdvertOffer.HOUSE);
        map.put(9, BuilderAvitoAdvertOffer.LAND);
        return map;
    }

    @Override
    protected String getId(ServiceAllJson serviceAllJson){
        return String.format("%s.%s",serviceAllJson.getId(),serviceAllJson.getDataClass());
    }
}
