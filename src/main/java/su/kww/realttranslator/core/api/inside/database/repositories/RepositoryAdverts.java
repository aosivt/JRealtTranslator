package su.kww.realttranslator.core.api.inside.database.repositories;

import org.hibernate.Session;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Set;
import java.util.stream.Collectors;

public class RepositoryAdverts extends AbstractRepository {

    public static Set<Advert> createAdverts(Set<ServiceAllJson> serviceAllJsons){
        return serviceAllJsons.stream()
                              .map(RepositoryAdverts::create)
                              .collect(Collectors.toSet());
    }

    public static Advert create(ServiceAllJson serviceAllJson){
        Advert advert = new Advert();
        advert.setDataType(serviceAllJson.getDataClass());
        advert.setDomstorId(serviceAllJson.getId());
        advert.setRent(serviceAllJson.isActiveRent());
        advert.setSale(serviceAllJson.isActiveSale());
        advert.setServerDate(serviceAllJson.getServerDt());
        advert.setJson(toJson(serviceAllJson));
        return advert;
    }

    public static Advert getById(Integer dataType, Long domstorId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Advert> criteriaAdvert = builder.createQuery(Advert.class);
        Root<Advert> root = criteriaAdvert.from(Advert.class);
        criteriaAdvert.select(root);
        criteriaAdvert.where(builder.equal(root.get("dataType"),dataType.toString()))
                      .where(builder.equal(root.get("domstorId"),domstorId.toString()));

        Advert advert = null;
        try {
            advert = session.createQuery(criteriaAdvert).getSingleResult();
        } catch (NoResultException e){

        }

        session.clear();
        session.close();

        return advert;
    }
}
