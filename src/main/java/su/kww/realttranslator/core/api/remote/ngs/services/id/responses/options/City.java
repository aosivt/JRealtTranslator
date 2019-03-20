package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("grammatical_cases_ru")
    @Expose
    private GrammaticalCasesRu grammaticalCasesRu;
    @SerializedName("name_seo")
    @Expose
    private String nameSeo;
    @SerializedName("name_ru")
    @Expose
    private String nameRu;
    @SerializedName("name_translit")
    @Expose
    private String nameTranslit;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("params")
    @Expose
    private Params_ params;
    @SerializedName("longitude")
    @Expose
    private Double longitude;

    public GrammaticalCasesRu getGrammaticalCasesRu() {
        return grammaticalCasesRu;
    }

    public void setGrammaticalCasesRu(GrammaticalCasesRu grammaticalCasesRu) {
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

    public String getNameTranslit() {
        return nameTranslit;
    }

    public void setNameTranslit(String nameTranslit) {
        this.nameTranslit = nameTranslit;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Params_ getParams() {
        return params;
    }

    public void setParams(Params_ params) {
        this.params = params;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}