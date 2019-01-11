package su.kww.realttranslator.core.api.inside.database.repositories;

import org.hibernate.Session;
import org.hibernate.query.Query;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Set;

public class RepositoryAdvertSite extends AbstractRepository{

    public static AdvertSite create(LinksSiteJson linksSites){
        AdvertSite advertSite = new AdvertSite();
        advertSite.setSiteId(linksSites.getSiteId());
        advertSite.setDataType(linksSites.getType());
        advertSite.setDomstorId(linksSites.getDomstorId());
        advertSite.setLoaded(linksSites.getLoaded());
        advertSite.setOperationId(linksSites.getOperation());
        advertSite.setExternalId(linksSites.getExternalId());
        advertSite.setAdvertEditDt(linksSites.getAdvertEditDate());
        advertSite.setVersion(linksSites.getVersion());
        advertSite.setExternalUrl(linksSites.getExternalUrl());
        return advertSite;
    }

    public static List<AdvertSite> getAdvertSiteBySite(Site site){
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<AdvertSite> criteriaAdvertSite = builder.createQuery(AdvertSite.class);
        Root<AdvertSite> root = criteriaAdvertSite.from(AdvertSite.class);
        criteriaAdvertSite.select(root);
        criteriaAdvertSite.where(builder.equal(root.get("siteId"),site.getId().toString()));
        List<AdvertSite> advertSites = session.createQuery(criteriaAdvertSite).getResultList();
        session.clear();
        session.close();
        return advertSites;
    }




}
