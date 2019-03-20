package su.kww.realttranslator.core.api.remote.ngs.services.city.response.options;
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
    @SerializedName("area_id")
    @Expose
    private Integer areaId;
    @SerializedName("area_name")
    @Expose
    private String areaName;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("region_name")
    @Expose
    private String regionName;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("geo_id")
    @Expose
    private Integer geoId;
    @SerializedName("is_rugion_cp")
    @Expose
    private Boolean isRugionCp;
    @SerializedName("switch_off_mobile_cp")
    @Expose
    private Boolean switchOffMobileCp;
    @SerializedName("use_publications")
    @Expose
    private Boolean usePublications;

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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getGeoId() {
        return geoId;
    }

    public void setGeoId(Integer geoId) {
        this.geoId = geoId;
    }

    public Boolean getIsRugionCp() {
        return isRugionCp;
    }

    public void setIsRugionCp(Boolean isRugionCp) {
        this.isRugionCp = isRugionCp;
    }

    public Boolean getSwitchOffMobileCp() {
        return switchOffMobileCp;
    }

    public void setSwitchOffMobileCp(Boolean switchOffMobileCp) {
        this.switchOffMobileCp = switchOffMobileCp;
    }

    public Boolean getUsePublications() {
        return usePublications;
    }

    public void setUsePublications(Boolean usePublications) {
        this.usePublications = usePublications;
    }

}
