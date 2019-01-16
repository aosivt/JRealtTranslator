package su.kww.realttranslator.translators.service.yandex.offer;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name="offer")
@XmlAccessorType(XmlAccessType.FIELD)
public class YandexAdvertOffer {

    public YandexAdvertOffer(){}
    public YandexAdvertOffer(AdvertSite advertSite){}

    @XmlAttribute(name = "internal-id")
    private String id;

    private String type;
    private String propertyType; //property-type
    private String category;
    private String url;
    private Date creationDate; //creation-date
    private Date lastUpdateDate; //last-update-date
    private Location location;
    private SalesAgent salesAgent; //sales-agent
    private Price price;
    private String description;
    private Area area;
    private Boolean studio;
    private Integer rooms;
    private Integer roomsOffered; //rooms-offered
    private Integer floor;
    private Integer floorsTotal; //floors-total
    private String buildingType; //building-type
    private Boolean lift;
    private Boolean rubbishChute; //rubbish-chute
    private Boolean parking;
    private Boolean alarm;
    private Boolean flatAlarm; //flat-alarm
    private Boolean sauna;
    private Boolean electricitySupply; //electricity-supply
    private Boolean haggle;
    private Boolean mortgage;
    private Boolean rentPledge; //rent-pledge
    private Boolean security;
    private Boolean utilitiesIncluded; //utilities-included
    private String quality;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public SalesAgent getSalesAgent() {
        return salesAgent;
    }

    public void setSalesAgent(SalesAgent salesAgent) {
        this.salesAgent = salesAgent;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Boolean getStudio() {
        return studio;
    }

    public void setStudio(Boolean studio) {
        this.studio = studio;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getRoomsOffered() {
        return roomsOffered;
    }

    public void setRoomsOffered(Integer roomsOffered) {
        this.roomsOffered = roomsOffered;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloorsTotal() {
        return floorsTotal;
    }

    public void setFloorsTotal(Integer floorsTotal) {
        this.floorsTotal = floorsTotal;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Boolean getLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }

    public Boolean getRubbishChute() {
        return rubbishChute;
    }

    public void setRubbishChute(Boolean rubbishChute) {
        this.rubbishChute = rubbishChute;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getAlarm() {
        return alarm;
    }

    public void setAlarm(Boolean alarm) {
        this.alarm = alarm;
    }

    public Boolean getFlatAlarm() {
        return flatAlarm;
    }

    public void setFlatAlarm(Boolean flatAlarm) {
        this.flatAlarm = flatAlarm;
    }

    public Boolean getSauna() {
        return sauna;
    }

    public void setSauna(Boolean sauna) {
        this.sauna = sauna;
    }

    public Boolean getElectricitySupply() {
        return electricitySupply;
    }

    public void setElectricitySupply(Boolean electricitySupply) {
        this.electricitySupply = electricitySupply;
    }

    public Boolean getHaggle() {
        return haggle;
    }

    public void setHaggle(Boolean haggle) {
        this.haggle = haggle;
    }

    public Boolean getMortgage() {
        return mortgage;
    }

    public void setMortgage(Boolean mortgage) {
        this.mortgage = mortgage;
    }

    public Boolean getRentPledge() {
        return rentPledge;
    }

    public void setRentPledge(Boolean rentPledge) {
        this.rentPledge = rentPledge;
    }

    public Boolean getSecurity() {
        return security;
    }

    public void setSecurity(Boolean security) {
        this.security = security;
    }

    public Boolean getUtilitiesIncluded() {
        return utilitiesIncluded;
    }

    public void setUtilitiesIncluded(Boolean utilitiesIncluded) {
        this.utilitiesIncluded = utilitiesIncluded;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
