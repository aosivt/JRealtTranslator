package su.kww.realttranslator.translators.services.vse42.builders.offer;

import java.util.HashSet;
import java.util.Set;

public class Vse42Advert {
    private Set<Vse42AdvertOffer> vse42Adverts;

    public Vse42Advert(){}
    public Vse42Advert(Set<Vse42AdvertOffer> vse42Adverts){
        this.vse42Adverts = vse42Adverts;
    }

    public Set<Vse42AdvertOffer> getVse42Adverts() {
        return vse42Adverts;
    }

    public void setVse42Adverts(Set<Vse42AdvertOffer> vse42Adverts) {
        this.vse42Adverts = vse42Adverts;
    }
}
