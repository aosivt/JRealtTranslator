package su.kww.realttranslator.translators.services.vse42.builders.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;

import java.util.List;
import java.util.Set;

public class Vse42AdvertOffer implements AdvertOffer {
    
    @JsonProperty("category")
    private Integer category;

    @JsonProperty("operation")
    private String operation;

    @JsonProperty("type")
    private String type;

    @JsonProperty("district")
    private Integer district;

    @JsonProperty("address")
    private String address;

    @JsonProperty("rooms")
    private Integer rooms;

    @JsonProperty("floor")
    private Integer floor;

    @JsonProperty("floor_max")
    private Integer floorMax;

    @JsonProperty("area")
    private Float Area;

    @JsonProperty("kitchen_area")
    private Float kitchenArea;

    @JsonProperty("living_area")
    private Float livingArea;

    @JsonProperty("masonry")
    private Integer masonry;

    @JsonProperty("wc")
    private Integer wc;

    @JsonProperty("logia")
    private Integer logia;

    @JsonProperty("repair")
    private Integer repair;

    @JsonProperty("telephone")
    private String phone;

    @JsonProperty("additional_info")
    private String additionalInfo;

    @JsonProperty("cost")
    private Float cost;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("files")
    private Set<String> files;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloorMax() {
        return floorMax;
    }

    public void setFloorMax(Integer floorMax) {
        this.floorMax = floorMax;
    }

    public Float getArea() {
        return Area;
    }

    public void setArea(Float area) {
        Area = area;
    }

    public Float getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Float kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public Float getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Float livingArea) {
        this.livingArea = livingArea;
    }

    public Integer getMasonry() {
        return masonry;
    }

    public void setMasonry(Integer masonry) {
        this.masonry = masonry;
    }

    public Integer getWc() {
        return wc;
    }

    public void setWc(Integer wc) {
        this.wc = wc;
    }

    public Integer getLogia() {
        return logia;
    }

    public void setLogia(Integer logia) {
        this.logia = logia;
    }

    public Integer getRepair() {
        return repair;
    }

    public void setRepair(Integer repair) {
        this.repair = repair;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<String> getFiles() {
        return files;
    }

    public void setFiles(Set<String> files) {
        this.files = files;
    }
}
