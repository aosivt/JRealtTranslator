package su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options;

import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

import java.util.HashMap;
import java.util.Map;

public class BuilderUploadOptions {
    private BuilderUploadOptions(){}

    public static Map<String,String> build(ServiceAllJson allJson){
        BuilderUploadOptions builder = new BuilderUploadOptions();
        Map<String,String> options = new HashMap<>();
        options.put("type","photo");
        options.put("media", builder.getFullPathPhoto(allJson));
        return options;
    }

    private String getFullPathPhoto(ServiceAllJson allJson){
        return String.format("%s_%s",allJson.getDataClass(),allJson.getId());
    }
}
