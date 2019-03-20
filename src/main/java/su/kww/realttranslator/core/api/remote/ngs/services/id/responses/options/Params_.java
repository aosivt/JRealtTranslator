package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Params_ {

    @SerializedName("name_seo")
    @Expose
    private String nameSeo;

    public String getNameSeo() {
        return nameSeo;
    }

    public void setNameSeo(String nameSeo) {
        this.nameSeo = nameSeo;
    }

}