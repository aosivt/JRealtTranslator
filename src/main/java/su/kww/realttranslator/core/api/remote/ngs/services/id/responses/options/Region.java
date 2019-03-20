package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Region {

    @SerializedName("grammatical_cases_ru")
    @Expose
    private GrammaticalCasesRu__ grammaticalCasesRu;
    @SerializedName("name_seo")
    @Expose
    private String nameSeo;
    @SerializedName("name_ru")
    @Expose
    private String nameRu;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("name_translit")
    @Expose
    private String nameTranslit;
    @SerializedName("latitude")
    @Expose
    private Integer latitude;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("params")
    @Expose
    private Params__ params;
    @SerializedName("longitude")
    @Expose
    private Integer longitude;

    public GrammaticalCasesRu__ getGrammaticalCasesRu() {
        return grammaticalCasesRu;
    }

    public void setGrammaticalCasesRu(GrammaticalCasesRu__ grammaticalCasesRu) {
        this.grammaticalCasesRu = grammaticalCasesRu;
    }

    public String getNameSeo() {
        return nameSeo;
    }

    public void setNameSeo(String nameSeo) {
        this.nameSeo = nameSeo;
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getNameTranslit() {
        return nameTranslit;
    }

    public void setNameTranslit(String nameTranslit) {
        this.nameTranslit = nameTranslit;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Params__ getParams() {
        return params;
    }

    public void setParams(Params__ params) {
        this.params = params;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

}