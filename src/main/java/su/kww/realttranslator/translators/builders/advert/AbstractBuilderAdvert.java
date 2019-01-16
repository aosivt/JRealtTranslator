package su.kww.realttranslator.translators.builders.advert;

import com.google.gson.Gson;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;
import su.kww.realttranslator.core.model.Operation;

public abstract class AbstractBuilderAdvert implements BuilderAdvert{

    private final Gson gson = new Gson();

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
        return gson.fromJson(advertSite.getAdvert().getJson(),ServiceAllJson.class);
    }

    protected String getId(ServiceAllJson serviceAllJson){
        return String.format("%s-%s",serviceAllJson.getData_class(),serviceAllJson.getId());
    }



}
