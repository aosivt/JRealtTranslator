package su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.response.options;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("name_full")
    @Expose
    private String nameFull;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("district")
    @Expose
    private District district;
    @SerializedName("microdistrict")
    @Expose
    private Microdistrict microdistrict;
    @SerializedName("street")
    @Expose
    private Street street;
    @SerializedName("house_number")
    @Expose
    private String houseNumber;
    @SerializedName("floors")
    @Expose
    private Integer floors;
    @SerializedName("release_date")
    @Expose
    private ReleaseDate releaseDate;
    @SerializedName("photos")
    @Expose
    private List<Object> photos = null;
    @SerializedName("documents")
    @Expose
    private String documents;
    @SerializedName("is_house")
    @Expose
    private Boolean isHouse;
    @SerializedName("material")
    @Expose
    private Material material;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Microdistrict getMicrodistrict() {
        return microdistrict;
    }

    public void setMicrodistrict(Microdistrict microdistrict) {
        this.microdistrict = microdistrict;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ReleaseDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Object> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Object> photos) {
        this.photos = photos;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public Boolean getIsHouse() {
        return isHouse;
    }

    public void setIsHouse(Boolean isHouse) {
        this.isHouse = isHouse;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
