package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.options;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("genitive_case")
    @Expose
    private String genitiveCase;
    @SerializedName("prepositional_case")
    @Expose
    private String prepositionalCase;
    @SerializedName("accusative_case")
    @Expose
    private String accusativeCase;
    @SerializedName("adverb")
    @Expose
    private String adverb;
    @SerializedName("abbr")
    @Expose
    private String abbr;
    @SerializedName("name_en")
    @Expose
    private String nameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenitiveCase() {
        return genitiveCase;
    }

    public void setGenitiveCase(String genitiveCase) {
        this.genitiveCase = genitiveCase;
    }

    public String getPrepositionalCase() {
        return prepositionalCase;
    }

    public void setPrepositionalCase(String prepositionalCase) {
        this.prepositionalCase = prepositionalCase;
    }

    public String getAccusativeCase() {
        return accusativeCase;
    }

    public void setAccusativeCase(String accusativeCase) {
        this.accusativeCase = accusativeCase;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
