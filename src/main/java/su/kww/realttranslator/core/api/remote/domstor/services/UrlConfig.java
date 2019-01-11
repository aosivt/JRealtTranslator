package su.kww.realttranslator.core.api.remote.domstor.services;

public interface UrlConfig
{
    final static String LoginUrl            = "/rt/login.json";
    final static String ResourcesUrl        = "/rt/resources.json";
    final static String AdvertsUrl          = "/rt/all.json";
    final static String LogsUrl             = "/rt/logs.json";
    final static String UploadUrl           = "/rt/upload.json";
    final static String LinksOutUrl         = "/rt/post-links";
    final static String LinksInUrl          = "/rt/get-links";
    final static String ReferenceUrl        = "/rt/reference/{0}.json";
    final static String MailerPresetsUrl    = "/rt/mailer-presets.json";
}
