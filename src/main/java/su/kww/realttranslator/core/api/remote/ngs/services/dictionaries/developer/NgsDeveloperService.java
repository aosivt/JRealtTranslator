package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.developer;



import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.NgsDictionaryConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.NgsDictionaryResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.NgsDictionaryService;

import javax.inject.Inject;
import java.util.Objects;

public class NgsDeveloperService extends NgsDictionaryService{

    @Inject
    public NgsDeveloperService(){}


    private final String    NAME_DICTIONARY             = "developers";
    private final String    RUBRIC_DICTIONARY           = "newhomes";
    private final String    DEAL_TYPE_DICTIONARY        = "sell";
    private final Boolean   WITH_VALUES_DICTIONARY      = true;

    public Observable<NgsDictionaryResponse> getNgsDeveloper(Integer regionId, Integer limit) {
        if (Objects.isNull(limit)){
            limit = 0;
        }

        return getRetrofitForBaseUrl().create(NgsDictionaryConfig.class)
                .getDictionaryValues(
                        NAME_DICTIONARY,
                        RUBRIC_DICTIONARY,
                        DEAL_TYPE_DICTIONARY,
                        WITH_VALUES_DICTIONARY, regionId, limit);
    }

}
