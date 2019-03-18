package su.kww.realttranslator.core.api.remote.ngs.services.process.add.response;


import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.MetaData;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.response.options.Result;

public class AddProcessNgsResponse {
    private Result result;
    private MetaData metaData;

    public Result getResult() {
        return result;
    }

    public MetaData getMetaData() {
        return metaData;
    }
}
