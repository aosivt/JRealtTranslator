package su.kww.realttranslator.translators.builder;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;

import java.util.Set;

public interface TranslatorService {
    void process(Set<AdvertSite> advertSites);
}
