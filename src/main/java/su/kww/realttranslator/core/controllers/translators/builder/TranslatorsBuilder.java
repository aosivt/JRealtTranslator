package su.kww.realttranslator.core.controllers.translators.builder;

import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.translators.TranslatorItem;


public class TranslatorsBuilder {

    public static TranslatorItem build(final Site site){
        return BuildOptions.valueOf(site.getSiteKey().toUpperCase()).getTranslatorItem();
    }

}
