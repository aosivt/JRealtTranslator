package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.cooperative;

import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.NgsDictionaryConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.NgsDictionaryService;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.cooperative.response.NgsCooperativeResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.NgsDictionaryResponse;

import javax.inject.Inject;
import java.util.Objects;

public class NgsCooperativeService extends NgsDictionaryService {

    @Inject
    public NgsCooperativeService(){}


    private final String    NAME_DICTIONARY             = "garage_cooperatives";
    private final String    RUBRIC_DICTIONARY           = "garages";
    private final String    DEAL_TYPE_DICTIONARY        = "sell";
    private final Boolean   WITH_VALUES_DICTIONARY      = true;

    public Observable<NgsDictionaryResponse> getNgsCooperative(Integer regionId, Integer limit) {
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
