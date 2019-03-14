package su.kww.realttranslator.translators.services.avito.offer;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.translators.builders.advert.AdvertOffer;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.Set;

@XmlRootElement(name="Ad")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvitoAdvertOffer implements AdvertOffer {

    public AvitoAdvertOffer(){}
    public AvitoAdvertOffer(AdvertSite advertSite){}

    @XmlElement(name = "Id")
    private String id;
    @XmlElement(name = "Category")
    private String category;
    @XmlElement(name = "DateBegin")
    private Date dateBegin;
    @XmlElement(name = "DateEnd")
    private Date dateEnd;
    @XmlElement(name = "Region")
    private String region;
    @XmlElement(name = "City")
    private String city;
    @XmlElement(name = "Subway")
    private String subway;
    @XmlElement(name = "District")
    private String district;
    @XmlElement(name="Description")
    private String description;
    @XmlElement(name="Price")
    private String price;
    @XmlElement(name="CompanyName")
    private String companyName;
    @XmlElement(name="ManagerName")
    private String managerName;
    @XmlElement(name="EMail")
    private String eMail;
    @XmlElement(name="ContactPhone")
    private String contactPhone;
    @XmlElement(name="AdStatus")
    private String adStatus;
    @XmlElement(name="OperationType")
    private String operationType;
    @XmlElement(name="Street")
    private String street;
    @XmlElement(name="Rooms")
    private String rooms;
    @XmlElement(name="Square")
    private String square;
    @XmlElement(name="Floor")
    private String floor;
    @XmlElement(name="Floors")
    private String floors;
    @XmlElement(name="HouseType")
    private String houseType;
    @XmlElement(name="LeaseType")
    private String leaseType;
    @XmlElement(name="LeaseCommissionSize")
    private Integer leaseCommissionSize;
    @XmlElement(name="LeaseDeposit")
    private String leaseDeposit;
    @XmlElement(name="LeaseAppliances")
    private Set<String> leaseAppliances;
    @XmlElement(name="PropertyRights")
    private String propertyRights;
    @XmlElement(name="MarketType")
    private String marketType;
    @XmlElement(name="LandArea")
    private String landArea;
    @XmlElement(name="DistanceToCity")
    private String distanceToCity;
    @XmlElement(name="WallsType")
    private String wallsType;
    @XmlElement(name="ObjectType")
    private String objectType;
    @XmlElement(name="ObjectSubtype")
    private String objectSubtype;
    @XmlElement(name="Secured")
    private String secured;
    @XmlElement(name="BuildingClass")
    private String buildingClass;
    @XmlElement(name="Address")
    private String address;
    @XmlElement(name="Latitude")
    private String latitude;
    @XmlElement(name="Longitude")
    private String longitude;

//    @XmlElement(name="image")
//    private Set<String> photos;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(String adStatus) {
        this.adStatus = adStatus;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public Integer getLeaseCommissionSize() {
        return leaseCommissionSize;
    }

    public void setLeaseCommissionSize(Integer leaseCommissionSize) {
        this.leaseCommissionSize = leaseCommissionSize;
    }

    public String getLeaseDeposit() {
        return leaseDeposit;
    }

    public void setLeaseDeposit(String leaseDeposit) {
        this.leaseDeposit = leaseDeposit;
    }

    public Set<String> getLeaseAppliances() {
        return leaseAppliances;
    }

    public void setLeaseAppliances(Set<String> leaseAppliances) {
        this.leaseAppliances = leaseAppliances;
    }

    public String getPropertyRights() {
        return propertyRights;
    }

    public void setPropertyRights(String propertyRights) {
        this.propertyRights = propertyRights;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getDistanceToCity() {
        return distanceToCity;
    }

    public void setDistanceToCity(String distanceToCity) {
        this.distanceToCity = distanceToCity;
    }

    public String getWallsType() {
        return wallsType;
    }

    public void setWallsType(String wallsType) {
        this.wallsType = wallsType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectSubtype() {
        return objectSubtype;
    }

    public void setObjectSubtype(String objectSubtype) {
        this.objectSubtype = objectSubtype;
    }

    public String getSecured() {
        return secured;
    }

    public void setSecured(String secured) {
        this.secured = secured;
    }

    public String getBuildingClass() {
        return buildingClass;
    }

    public void setBuildingClass(String buildingClass) {
        this.buildingClass = buildingClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
