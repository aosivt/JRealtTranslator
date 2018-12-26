package su.kww.realttranslator.core.api.inside.database.repositoies;

import com.google.gson.Gson;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

import java.util.Set;
import java.util.stream.Collectors;

public class RepositoryAdverts {

    private static final Gson gson = new Gson();

    public static Set<Advert> createAdverts(Set<ServiceAllJson> serviceAllJsons){
        return serviceAllJsons.parallelStream().map(RepositoryAdverts::createAdverts)
                              .sequential().collect(Collectors.toSet());
    }
    public static Advert createAdverts(ServiceAllJson serviceAllJson){

        Advert advert = new Advert();
        advert.setDataType(serviceAllJson.getData_class());
        advert.setDomstorId(serviceAllJson.getId());
        advert.setRent(serviceAllJson.getActive_rent());
        advert.setSale(serviceAllJson.getActive_sale());
        advert.setJson(gson.toJson(serviceAllJson));
        return advert;
    }
}
