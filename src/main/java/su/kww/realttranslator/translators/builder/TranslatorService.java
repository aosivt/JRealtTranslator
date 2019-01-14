package su.kww.realttranslator.translators.builder;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;

import java.util.Set;

public interface TranslatorService {
    ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword);
}
