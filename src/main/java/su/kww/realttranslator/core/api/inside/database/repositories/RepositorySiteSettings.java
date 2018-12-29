package su.kww.realttranslator.core.api.inside.database.repositories;

import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;
import su.kww.realttranslator.core.api.inside.database.entities.UserSettings;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

public class RepositorySiteSettings extends AbstractRepository {

    public static SiteSettings defaultCreate(Site site){
        SiteSettings siteSettings = new SiteSettings();
        siteSettings.setSiteId(site.getId());
        site.setSiteSettings(siteSettings);

        return siteSettings;
    }
}
