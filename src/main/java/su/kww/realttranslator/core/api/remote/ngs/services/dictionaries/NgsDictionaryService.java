package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries;

import io.reactivex.Observable;
import su.kww.realttranslator.core.api.remote.ngs.services.AbstractService;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.NgsDictionaryResponse;

public abstract class NgsDictionaryService extends AbstractService implements  NgsDictionaryConfig{
    @Override
    public Observable<NgsDictionaryResponse> getDictionaryValues(String name, String rubric, String dealType, Boolean withValues, Integer regionId, Integer limit) {
        return getRetrofitForBaseUrl().create(NgsDictionaryConfig.class).getDictionaryValues(name, rubric, dealType, withValues, regionId, limit);
    }
}
