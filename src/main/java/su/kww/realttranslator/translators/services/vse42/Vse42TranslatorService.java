package su.kww.realttranslator.translators.services.vse42;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.service.AbstractTranslatorService;
import su.kww.realttranslator.translators.builders.ResultProcessService;

import java.util.Set;

public class Vse42TranslatorService extends AbstractTranslatorService {
    @Override
    public ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword) {
        return null;
    }

    @Override
    public String getSiteKey() {
        return "vse42";
    }

    @Override
    public String getSiteFormat() {
        return "json";
    }
}
