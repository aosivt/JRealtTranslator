package su.kww.realttranslator.core.api.remote.ngs.services.process.add.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.options.AbstractType;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.options.Contacts;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.options.Geo;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.JsonPropertyPhoto;

import java.util.Set;

public class AddProcessNgsRequest {
    @SerializedName("rubric")
    @Expose
    @JsonProperty("rubric")
    private String rubric;
    @SerializedName("deal_type")
    @Expose
    @JsonProperty("deal_type")
    private String dealType;
    private String price;
    private String description;
    private Set<JsonPropertyPhoto> photos;
    private Contacts contacts;
    @SerializedName("is_net_sale")
    @Expose
    @JsonProperty("is_net_sale")
    private Boolean isNetSale;
    @SerializedName("is_exchange")
    @Expose
    @JsonProperty("is_exchange")
    private Boolean isExchange;
    @SerializedName("is_pawn")
    @Expose
    @JsonProperty("is_pawn")
    private Boolean isPawn;
    @SerializedName("is_deposit")
    @Expose
    @JsonProperty("is_deposit")
    private Boolean isDeposit;
    @SerializedName("is_mortgage")
    @Expose
    @JsonProperty("is_mortgage")
    private Boolean isMortage;
    @SerializedName("agency_code")
    @Expose
    @JsonProperty("agency_code")
    private String agencyCode;
    @SerializedName("rent_duration_type")
    @Expose
    @JsonProperty("rent_duration_type")
    private AbstractType rentDurationType;
    @SerializedName("total_area")
    @Expose
    @JsonProperty("total_area")
    private Float totalArea;
    @SerializedName("living_area")
    @Expose
    @JsonProperty("living_area")
    private Float livingArea;
    @SerializedName("kitchen_area")
    @Expose
    @JsonProperty("kitchen_area")
    private Float kitchenArea;
    private Integer floor;
    @SerializedName("floors_count")
    @Expose
    @JsonProperty("floors_count")
    private Integer floorsCount;
    @SerializedName("loggia_count")
    @Expose
    @JsonProperty("loggia_count")
    private Integer loggiaCount;
    @SerializedName("balcony_count")
    @Expose
    @JsonProperty("balcony_count")
    private Integer balconyCount;
    private AbstractType type;
    @SerializedName("layout_type")
    @Expose
    @JsonProperty("layout_type")
    private AbstractType layoutType;
    @SerializedName("condition_type")
    @Expose
    @JsonProperty("condition_type")
    private AbstractType conditionType;
    @SerializedName("ownership_type")
    @Expose
    @JsonProperty("ownership_type")
    private AbstractType ownershipType;
    @SerializedName("wc_type")
    @Expose
    @JsonProperty("wc_type")
    private AbstractType wcType;
    @SerializedName("rooms_count_type")
    @Expose
    @JsonProperty("rooms_count_type")
    private AbstractType roomsCountType;

    private Geo geo;

    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<JsonPropertyPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<JsonPropertyPhoto> photos) {
        this.photos = photos;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Boolean getNetSale() {
        return isNetSale;
    }

    public void setNetSale(Boolean netSale) {
        isNetSale = netSale;
    }

    public Boolean getExchange() {
        return isExchange;
    }

    public void setExchange(Boolean exchange) {
        isExchange = exchange;
    }

    public Boolean getPawn() {
        return isPawn;
    }

    public void setPawn(Boolean pawn) {
        isPawn = pawn;
    }

    public Boolean getDeposit() {
        return isDeposit;
    }

    public void setDeposit(Boolean deposit) {
        isDeposit = deposit;
    }

    public Boolean getMortage() {
        return isMortage;
    }

    public void setMortage(Boolean mortage) {
        isMortage = mortage;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public AbstractType getRentDurationType() {
        return rentDurationType;
    }

    public void setRentDurationType(AbstractType rentDurationType) {
        this.rentDurationType = rentDurationType;
    }

    public Float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Float totalArea) {
        this.totalArea = totalArea;
    }

    public Float getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Float livingArea) {
        this.livingArea = livingArea;
    }

    public Float getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Float kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(Integer floorsCount) {
        this.floorsCount = floorsCount;
    }

    public Integer getLoggiaCount() {
        return loggiaCount;
    }

    public void setLoggiaCount(Integer loggiaCount) {
        this.loggiaCount = loggiaCount;
    }

    public Integer getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(Integer balconyCount) {
        this.balconyCount = balconyCount;
    }

    public AbstractType getType() {
        return type;
    }

    public void setType(AbstractType type) {
        this.type = type;
    }

    public AbstractType getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(AbstractType layoutType) {
        this.layoutType = layoutType;
    }

    public AbstractType getConditionType() {
        return conditionType;
    }

    public void setConditionType(AbstractType conditionType) {
        this.conditionType = conditionType;
    }

    public AbstractType getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(AbstractType ownershipType) {
        this.ownershipType = ownershipType;
    }

    public AbstractType getWcType() {
        return wcType;
    }

    public void setWcType(AbstractType wcType) {
        this.wcType = wcType;
    }

    public AbstractType getRoomsCountType() {
        return roomsCountType;
    }

    public void setRoomsCountType(AbstractType roomsCountType) {
        this.roomsCountType = roomsCountType;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
