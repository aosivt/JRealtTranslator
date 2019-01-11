package su.kww.realttranslator.translators.builder;

import su.kww.realttranslator.core.api.inside.database.entities.Site;


public class TranslatorServiceBuilder {

    public static TranslatorService build(final Site site){
        return BuildOptions.valueOf(site.getSiteKey().toUpperCase()).getTranslator();
    }

}
