package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("resultset")
    @Expose
    private Resultset resultset;

    public Resultset getResultset() {
        return resultset;
    }

    public void setResultset(Resultset resultset) {
        this.resultset = resultset;
    }
}

