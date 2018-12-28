package su.kww.realttranslator.core.api.inside.database.repositories;

import com.google.gson.Gson;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

import java.util.Set;
import java.util.stream.Collectors;

public class RepositoryAdverts extends AbstractRepository {

    public static Set<Advert> createAdverts(Set<ServiceAllJson> serviceAllJsons){
        return serviceAllJsons.parallelStream()
                              .map(RepositoryAdverts::create)
                              .collect(Collectors.toSet());
    }

    public static Advert create(ServiceAllJson serviceAllJson){
        Advert advert = new Advert();
        advert.setDataType(serviceAllJson.getData_class());
        advert.setDomstorId(serviceAllJson.getId());
        advert.setRent(serviceAllJson.getActive_rent());
        advert.setSale(serviceAllJson.getActive_sale());
        advert.setServerDate(serviceAllJson.getServer_dt());
        advert.setJson(toJson(serviceAllJson));
        return advert;
    }
}
