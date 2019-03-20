package su.kww.realttranslator.core.api.remote.ngs.services.process.remove.response;


import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.response.options.MetaData;
import su.kww.realttranslator.core.api.remote.ngs.services.process.remove.response.options.Result;

import java.util.Set;

public class RemoveProcessNgsResponse {
    private Set<Result> results;
    private MetaData metaData;

    public Set<Result> getResults() {
        return results;
    }

    public MetaData getMetaData() {
        return metaData;
    }
}
