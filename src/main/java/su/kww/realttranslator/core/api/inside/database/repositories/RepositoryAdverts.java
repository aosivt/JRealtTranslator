package su.kww.realttranslator.core.api.inside.database.repositories;

import com.google.gson.Gson;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

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
}
