package kww.RealtTranslator.Core.Api;

import kww.RealtTranslator.Core.Api.Interfaces.IApiConfig;

import javax.inject.Inject;

public class ApiConfig implements IApiConfig {

    private final static String baseUrl = "http://api.domstor.ru/";

    @Inject
    public ApiConfig(){}

    public String getLoginUrl(){
        return baseUrl + "/rt/login.json";
    }

    public String getResourcesUrl(){
        return baseUrl + "/rt/resources.json";
    }

    public String getAdvertsUrl(){
        return baseUrl + "/rt/all.json";
    }

    public String getLogUrl(){
        return baseUrl + "/rt/logs";
    }

    public String getUploadUrl(){
        return baseUrl + "/rt/upload";
    }

    public String getLinksOutUrl(){
        return baseUrl + "/rt/post-links";
    }

    public String getLinksInUrl(){
        return baseUrl + "/rt/get-links";
    }

    public String getReferenceUrl(){
        return baseUrl + "/rt/reference/{0}.json";
    }

    public String getMailerPresetsUrl(){
        return baseUrl + "/rt/mailer-presets.json";
    }

}
