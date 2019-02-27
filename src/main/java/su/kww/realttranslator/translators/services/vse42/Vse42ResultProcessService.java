package su.kww.realttranslator.translators.services.vse42;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.builders.ResultProcessService;

import java.io.File;
import java.util.Set;

public class Vse42ResultProcessService implements ResultProcessService<File> {
    private File resultOfferFile;

    private Vse42ResultProcessService(){}

    public static Vse42ResultProcessService build(Set<AdvertSite> advertSites){
        Vse42ResultProcessService yandexResultProcessService = new Vse42ResultProcessService();

        return new Vse42ResultProcessService();
    }

    @Override
    public Set<String> getErrors() {
        return null;
    }

    @Override
    public File getResult() {
        return resultOfferFile;
    }
}
