package su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geo {
    private AbstractGeo city;
    private AbstractGeo district;
    @SerializedName("micro_district")
    @Expose
    @JsonProperty("micro_district")
    private AbstractGeo microDistrict;
    private AbstractType region;
    @SerializedName("house_number")
    @Expose
    @JsonProperty("house_number")
    private String houseNumber;

    public AbstractGeo getCity() {
        return city;
    }

    public void setCity(AbstractGeo city) {
        this.city = city;
    }

    public AbstractGeo getDistrict() {
        return district;
    }

    public void setDistrict(AbstractGeo district) {
        this.district = district;
    }

    public AbstractGeo getMicroDistrict() {
        return microDistrict;
    }

    public void setMicroDistrict(AbstractGeo microDistrict) {
        this.microDistrict = microDistrict;
    }

    public AbstractType getRegion() {
        return region;
    }

    public void setRegion(AbstractType region) {
        this.region = region;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
