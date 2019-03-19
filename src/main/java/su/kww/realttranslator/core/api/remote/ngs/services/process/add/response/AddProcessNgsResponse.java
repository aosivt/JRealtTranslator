package su.kww.realttranslator.core.api.remote.ngs.services.process.add.response;


import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.MetaData;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.Result;

import java.util.Set;

public class AddProcessNgsResponse {
    private Set<Result> results;
    private MetaData metaData;

    public Set<Result> getResults() {
        return results;
    }

    public MetaData getMetaData() {
        return metaData;
    }
}
