package su.kww.realttranslator.core.api.inside.database.repositories;

import org.hibernate.Session;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RepositorySite extends AbstractRepository{

    private final static DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

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

}
