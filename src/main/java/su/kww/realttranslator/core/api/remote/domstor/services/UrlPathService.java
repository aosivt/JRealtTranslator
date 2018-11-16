package su.kww.realttranslator.core.api.remote.domstor.services;

public enum UrlPathService {
    LOGIN_URL("/rt/login.json"),
    RESOURCES_URL("/rt/resources.json"),
    ADVERTS_URL("/rt/all.json"),
    LOGS_URL("/rt/logs.json"),
    UPLOADS_URL("/rt/upload.json"),
    LINKS_URL("/rt/post-links.json"),
    LINKS_IN_URL("/rt/get-links.json"),
    REFERENCE_URL("/rt/reference/{0}.json"),
    MAILER_PRESENTS_URL("/rt/mailer-presets.json");

    private final String option;

    UrlPathService(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
