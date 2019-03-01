package su.kww.realttranslator.translators.builders.advert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdverts;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.model.Operation;

public abstract class AbstractBuilderAdvert implements BuilderAdvert{

    public static final Integer DOMSTOR_TYPE_FLAT       = 3;
    public static final Integer DOMSTOR_TYPE_HOUSE      = 5;
    public static final Integer DOMSTOR_TYPE_LAND       = 9;
    public static final Integer DOMSTOR_TYPE_GARAGE     = 7;
    public static final Integer DOMSTOR_TYPE_COMMERCE   = 1;


    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss")
                                                      .setLenient()
                                                      .create();

    protected Boolean isNotDeleteProcess(AdvertSite advertSite){
        return advertSite.getOperationId()!= Operation.DELETE.ordinal();
    }

    protected Boolean isAddProcess(AdvertSite advertSite){
        return advertSite.getOperationId() == Operation.ADD.ordinal();
    }
    protected Boolean isUpdateProcess(AdvertSite advertSite){
        return advertSite.getOperationId() == Operation.EDIT.ordinal();
    }
    protected Boolean isDeleteProcess(AdvertSite advertSite){
        return advertSite.getOperationId() == Operation.DELETE.ordinal();
    }


    protected ServiceAllJson getServiceAllJsonByAdvertSite(AdvertSite advertSite){
        Advert advert = RepositoryAdverts.getById(advertSite.getDataType(),advertSite.getDomstorId());
        return gson.fromJson(advert.getJson(),ServiceAllJson.class);
    }

    protected String getId(ServiceAllJson serviceAllJson){
        return String.format("%s-%s",serviceAllJson.getDataClass(),serviceAllJson.getId());
    }



}
