package su.kww.realttranslator.translators.service.yandex;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.builder.ResultProcessService;

import java.io.File;
import java.util.Set;

public class YandexResultProcessService implements ResultProcessService<File> {

    private File resultOfferFile;

    public static YandexResultProcessService build(Set<AdvertSite> advertSites){
        YandexResultProcessService yandexResultProcessService = new YandexResultProcessService();

        return new YandexResultProcessService();
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
