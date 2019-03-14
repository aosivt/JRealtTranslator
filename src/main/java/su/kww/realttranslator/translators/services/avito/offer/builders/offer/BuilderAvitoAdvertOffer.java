package su.kww.realttranslator.translators.services.avito.offer.builders.offer;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.services.avito.offer.AvitoAdvertOffer;
import su.kww.realttranslator.translators.services.avito.offer.builders.offer.options.*;


public enum BuilderAvitoAdvertOffer {

    FLAT{
        @Override
        public AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite) {
            return new FlatAvitoAdvertOffer();
        }
    },HOUSE{
        @Override
        public AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite) {
            return new HouseAvitoAdvertOffer();
        }
    },COMMERCE{
        @Override
        public AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite) {
            return new CommerceAvitoAdvertOffer();
        }
    },LAND{
        @Override
        public AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite) {
            return new LandAvitoAdvertOffer();
        }
    },GARAGE{
        @Override
        public AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite) {
            return new GarageAvitoAdvertOffer();
        }
    };

    public abstract AvitoAdvertOffer getAvitoAdvertOffer(AdvertSite advertSite);
}
