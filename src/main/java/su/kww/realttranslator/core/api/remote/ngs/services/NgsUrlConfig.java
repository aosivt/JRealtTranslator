package su.kww.realttranslator.core.api.remote.ngs.services;

public interface NgsUrlConfig {
    String LOGIN_URL = "/passport/login/";
    String HOME_PROCESS_URL = "/api/rn/v2/offers/homes/?isPreview=0";
    String REMOVE_PROCESS_URL = "/rpc-api-n1/v1/offers/";
    String CHECK_OLD_IDS_URL = "/api-n1/v1/offers/";
    String UPLOAD_PHOTOS = "/api/rn/v2/offers/media";
}
