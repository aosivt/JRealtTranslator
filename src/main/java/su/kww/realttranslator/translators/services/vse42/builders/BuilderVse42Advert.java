package su.kww.realttranslator.translators.services.vse42.builders;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.translators.builders.advert.AbstractBuilderAdvert;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42Advert;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42AdvertOffer;
import su.kww.realttranslator.translators.services.vse42.builders.offer.options.*;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class BuilderVse42Advert extends AbstractBuilderAdvert {

    public static final Integer CAT_NEW = 51;
    public static final Integer CAT_ROOM = 53;
    public static final Integer CAT_FLAT = 3;
    public static final Integer CAT_HOUSE = 45;
    public static final Integer CAT_GARAGE = 58;
    public static final Integer CAT_COMMERCE = 59;
    public static final String OPERATION_SELL = "sell";
    public static final String OPERATION_LEASE = "lease";

    private BuilderVse42Advert(){}

    public static Set<Vse42AdvertOffer> build(Set<AdvertSite> advertSites){

        BuilderVse42Advert builderVse42Advert = new BuilderVse42Advert();
        Set<Vse42AdvertOffer> vse42AdvertOffers = advertSites
                .parallelStream()
                .filter(builderVse42Advert::isNotDeleteProcess)
                .map(advertSite-> (Vse42AdvertOffer)builderVse42Advert.buildAdvertOffer(advertSite))
                .collect(Collectors.toSet());

        return vse42AdvertOffers;
    }

    @Override
    public AdvertOffer buildAdvertOffer(AdvertSite advertSite) {
        ServiceAllJson serviceAllJson = getServiceAllJsonByAdvertSite(advertSite);
        Vse42AdvertOffer vse42AdvertOffer = new Vse42AdvertOffer();
        Integer category = Vse42Districts.get(serviceAllJson,advertSite.getDataType());
        vse42AdvertOffer.setCategory(category);
        vse42AdvertOffer.setOperation(getOperation(serviceAllJson.isActiveSale()));
        vse42AdvertOffer.setDistrict(Vse42Districts.get(serviceAllJson,category));
        vse42AdvertOffer.setAddress(Vse42Address.get(serviceAllJson,category));
        vse42AdvertOffer.setFiles(serviceAllJson.getPhotos());
        vse42AdvertOffer.setId(String.format("%s%s",serviceAllJson.getDataClass(),serviceAllJson.getId()));
        vse42AdvertOffer.setRooms(Vse42Rooms.get(serviceAllJson,category));
        Vse42Object.set(serviceAllJson, category, vse42AdvertOffer);


        return vse42AdvertOffer;
    }

    private String getOperation(Boolean isSale){
        return isSale?OPERATION_SELL:OPERATION_LEASE;
    }

}
