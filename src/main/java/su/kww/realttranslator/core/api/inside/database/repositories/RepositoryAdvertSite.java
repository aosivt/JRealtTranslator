package su.kww.realttranslator.core.api.inside.database.repositories;

import org.hibernate.Session;
import org.hibernate.query.Query;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSiteAdvert;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
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
//        advertSite.setId(new AdvertSiteId(linksSites.getSiteId(),linksSites.getType(),linksSites.getDomstorId()));
        advertSite.setLoaded(linksSites.getLoaded());
        advertSite.setOperationId(linksSites.getOperation());
        advertSite.setExternalId(linksSites.getExternalId());
        advertSite.setAdvertEditDt(linksSites.getAdvertEditDate());
        advertSite.setVersion(linksSites.getVersion());
        advertSite.setExternalUrl(linksSites.getExternalUrl());

        return advertSite;
    }

    public static List<AdvertSiteAdvert> getAdvertSiteBySite(Site site){
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<AdvertSiteAdvert> criteriaAdvertSite = builder.createQuery(AdvertSiteAdvert.class);
        Root<AdvertSiteAdvert> root = criteriaAdvertSite.from(AdvertSiteAdvert.class);
        criteriaAdvertSite.select(root);
//        criteriaAdvertSite.where(builder.equal(root.get("id").get("siteId"),site.getId().toString()));
        criteriaAdvertSite.where(builder.equal(root.get("siteId"),site.getId().toString()));
        List<AdvertSiteAdvert> advertSites = session.createQuery(criteriaAdvertSite).getResultList();
        session.clear();
        session.close();
        return advertSites;
    }






}
