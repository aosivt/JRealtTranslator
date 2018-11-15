package kww.RealtTranslator.Core.Api;

import kww.RealtTranslator.Core.Api.Interfaces.IApiConfig;

public class ConfigurableApiConfig implements IApiConfig {
    private String baseUrl;
    
    public ConfigurableApiConfig(String baseUrl){
        this.baseUrl = baseUrl;
    }
        
    public String getLoginUrl(){
        return baseUrl + "/login.json";
    }

    public String getResourcesUrl(){
        return baseUrl + "/resources.json";
    }

    public String getAdvertsUrl(){
        return baseUrl + "/all.json";
    }

    public String getLogUrl(){
        return baseUrl + "/logs";
    }

    public String getUploadUrl(){
        return baseUrl + "/upload";
    }

    public String getLinksOutUrl(){
        return baseUrl + "/post-links";
    }

    public String getLinksInUrl(){
        return baseUrl + "/get-links";
    }

    public String getReferenceUrl(){
        return baseUrl + "/reference/{0}.json";
    }

    public String getMailerPresetsUrl(){
        return baseUrl + "/mailer-presets.json";
    }
}
