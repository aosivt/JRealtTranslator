package su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict.response.options;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("abbr")
    @Expose
    private String abbr;
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
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("district_name")
    @Expose
    private String districtName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

}
