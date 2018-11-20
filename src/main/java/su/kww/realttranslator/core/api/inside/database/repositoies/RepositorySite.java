package su.kww.realttranslator.core.api.inside.database.repositoies;

import org.hibernate.Session;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RepositorySite {

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

    public static Serializable update(Serializable serializable) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(serializable);
        session.getTransaction().commit();
        session.clear();
        session.close();
        return serializable;
    }

}
