package su.kww.realttranslator.core.api.inside.database.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.hibernate.Session;
import org.hibernate.Transaction;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;

import javax.persistence.Query;
import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class AbstractRepository {

    private static final Gson gson = new Gson();

    public synchronized static EntityDomstor update(EntityDomstor serializable) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(serializable);
        session.getTransaction().commit();
        session.clear();
        session.close();
        return serializable;
    }

    public static Set<EntityDomstor> updateBySetEntity(Set<EntityDomstor> entityDomstors) {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        entityDomstors.forEach(session::saveOrUpdate);
        session.getTransaction().commit();
        session.clear();
        session.close();
        return entityDomstors;
    }

    public static Set<EntityDomstor> select(String nameEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Set<EntityDomstor> serializables;
        String stringSelectEntities = String.format("From %s setEntity",nameEntity);
        Query query = session.createQuery(stringSelectEntities);
        serializables = (Set<EntityDomstor>) query.getResultList().parallelStream().collect(Collectors.toSet());
        session.clear();
        session.close();
        return serializables;
    }

    public static Boolean clearByCollectionEntity(Set<EntityDomstor> entityDomstors){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        entityDomstors.forEach(session::remove);
        session.getTransaction().commit();
        session.clear();
        session.close();
        return true;
    }

    public static Boolean clearTableByNameEntity(String nameEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String stringSelectEntities = String.format("delete from %s",nameEntity);
        Query query = session.createQuery(stringSelectEntities);
        query.executeUpdate();
        session.getTransaction().commit();
        session.clear();
        session.close();
        return true;
    }


    protected static String toJson(Serializable serializable){
        return gson.toJson(serializable);
    }

    public static Serializable fromJson(String jsonSerialise){
        return gson.fromJson(jsonSerialise,Serializable.class);
    }

}
