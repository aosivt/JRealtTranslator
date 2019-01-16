package su.kww.realttranslator.translators.builders.service;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.ResultProcessService;

import java.util.Set;

public interface TranslatorService {
    ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword);
    String getSiteKey();
    String getSiteFormat();
    String getFeedSite();
}
