package su.kww.realttranslator.core.controllers.translators.builder;

import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.translators.TranslatorItem;

import java.util.Arrays;

public class TranslatorsBuilder {

    public static TranslatorItem build(final Site site){

        return Arrays.asList(BuildOptions.values())
                     .parallelStream()
                     .filter(option->option.getSiteKey().equals(site.getSiteKey()))
                     .findFirst()
                     .orElse(BuildOptions.YANDEX_TRANSLATOR)
                     .getTranslatorItem();
    }
}
