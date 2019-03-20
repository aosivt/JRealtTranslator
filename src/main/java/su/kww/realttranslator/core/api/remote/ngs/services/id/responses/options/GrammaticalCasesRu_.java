package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrammaticalCasesRu_ {

    @SerializedName("locative")
    @Expose
    private String locative;
    @SerializedName("genitive")
    @Expose
    private String genitive;
    @SerializedName("nominative")
    @Expose
    private String nominative;

    public String getLocative() {
        return locative;
    }

    public void setLocative(String locative) {
        this.locative = locative;
    }

    public String getGenitive() {
        return genitive;
    }

    public void setGenitive(String genitive) {
        this.genitive = genitive;
    }

    public String getNominative() {
        return nominative;
    }

    public void setNominative(String nominative) {
        this.nominative = nominative;
    }

}
