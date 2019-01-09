package su.kww.realttranslator.core.api.inside.database.repositories;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;
import java.util.Objects;

public class RepositorySite extends AbstractRepository{

    public static Site create(Resource resource){
            Site site = new Site();
            site.setId(Integer.parseInt(resource.getId().toString()));
            site.setLogo(resource.getLogo());
            site.setAuthorizationRequired(resource.getAuthorizationRequired());
            site.setAutorunAvailable(resource.getAutorunAvailable());
            site.setAvailableTypes(String.join("|",resource.getAvailableTypes()));
            site.setName(resource.getName());
            site.setSiteKey(resource.getKey());
            site.setStatus(Integer.parseInt(resource.getStatus()));
            site.setUpdateAt(resource.getUpdatedAt());
            return site;
    }

    public static Boolean isNullSiteSettings(final Site site){
        return Objects.isNull(site.getSiteSettings());
    }


}
