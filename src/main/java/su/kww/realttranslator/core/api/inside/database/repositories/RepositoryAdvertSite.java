package su.kww.realttranslator.core.api.inside.database.repositories;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;

public class RepositoryAdvertSite extends AbstractRepository{

    public static AdvertSite create(LinksSiteJson linksSiteJson){
        AdvertSite advertSite = new AdvertSite();
        return advertSite;
    }




}
