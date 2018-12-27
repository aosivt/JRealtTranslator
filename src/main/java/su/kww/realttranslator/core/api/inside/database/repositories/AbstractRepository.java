package su.kww.realttranslator.core.api.inside.database.repositories;

import com.google.gson.Gson;
import org.hibernate.Session;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;

import java.io.Serializable;

public abstract class AbstractRepository {

    private static final Gson gson = new Gson();

    public static EntityDomstor update(EntityDomstor serializable) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(serializable);
        session.getTransaction().commit();
        session.clear();
        session.close();
        return serializable;
    }

    protected static String toJson(Serializable serializable){
        return gson.toJson(serializable);
    }
}
