package su.kww.realttranslator.translators.service.spran;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.service.AbstractTranslatorService;
import su.kww.realttranslator.translators.builders.ResultProcessService;

import java.util.Set;

public class SpranTranslatorService extends AbstractTranslatorService {
    @Override
    public ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword) {
        return null;
    }

    @Override
    public String getSiteKey() {
        return "spran";
    }

    @Override
    public String getSiteFormat() {
        return null;
    }
}
