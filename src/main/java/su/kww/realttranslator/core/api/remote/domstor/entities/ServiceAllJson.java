package su.kww.realttranslator.core.api.remote.domstor.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import su.kww.realttranslator.core.api.remote.domstor.entities.address.*;
import su.kww.realttranslator.core.api.remote.domstor.entities.options.feed.object.*;


import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class ServiceAllJson implements Serializable {

    @SerializedName("room_count")
    @Expose
    @JsonProperty("room_count")
    private Integer roomCount;
    @SerializedName("room_count_total")
    @Expose
    @JsonProperty("room_count_total")
    private String roomCountTotal;
    @SerializedName("flat_type_id")
    @Expose
    @JsonProperty("flat_type_id")
    private Integer flatTypeId;
    @SerializedName("object_floor")
    @Expose
    @JsonProperty("object_floor")
    private Integer objectFloor;
    @SerializedName("planning_id")
    @Expose
    @JsonProperty("planning_id")
    private String planningId;
    @SerializedName("floor_count")
    @Expose
    @JsonProperty("floor_count")
    private String floorCount;

    @SerializedName("object_floor_min")
    @Expose
    @JsonProperty("object_floor_min")
    private Integer objectFloorMin;


    @SerializedName("phone_id")
    @Expose
    @JsonProperty("phone_id")
    private String phoneId;
    @SerializedName("toilet_id")
    @Expose
    @JsonProperty("toilet_id")
    private Integer toiletId;
    @SerializedName("material_wall_id")
    @Expose
    @JsonProperty("material_wall_id")
    private Integer materialWallId;
    @SerializedName("building_material_id")
    @Expose
    @JsonProperty("building_material_id")
    private String buildingMaterialId;
    @SerializedName("new_building")
    @Expose
    @JsonProperty("new_building")
    private Boolean newBuilding;
    @SerializedName("delivery_year")
    @Expose
    @JsonProperty("delivery_year")
    private String deliveryYear;
    @SerializedName("delivery_quarter")
    @Expose
    @JsonProperty("delivery_quarter")
    private String deliveryQuarter;
    @SerializedName("delivered")
    @Expose
    @JsonProperty("delivered")
    private String delivered;
    @SerializedName("active_exchange")
    @Expose
    @JsonProperty("active_exchange")
    private Boolean activeExchange;
    @SerializedName("first_floor_commerce")
    @Expose
    @JsonProperty("first_floor_commerce")
    private String firstFloorCommerce;
    @SerializedName("ground_floor")
    @Expose
    @JsonProperty("ground_floor")
    private String groundFloor;
    @SerializedName("building_floor")
    @Expose
    @JsonProperty("building_floor")
    private Integer buildingFloor;
    @SerializedName("for_commerce")
    @Expose
    @JsonProperty("for_commerce")
    private Object forCommerce;
    @SerializedName("balcony_count")
    @Expose
    @JsonProperty("balcony_count")
    private Integer balconyCount;
    @SerializedName("loggia_count")
    @Expose
    @JsonProperty("loggia_count")
    private Integer loggiaCount;
    @SerializedName("household_technique_ids")
    @Expose
    @JsonProperty("household_technique_ids")
    private Set<Object> householdTechniqueIds;
    @SerializedName("balcony_arrangement_ids")
    @Expose
    @JsonProperty("balcony_arrangement_ids")
    private Set<Object> balconyArrangementIds;
    @SerializedName("furniture_ids")
    @Expose
    @JsonProperty("furniture_ids")
    private Set<Object>furnitureIds;
    @SerializedName("parking_ids")
    @Expose
    @JsonProperty("parking_ids")
    private Set<Object>parkingIds;
    @SerializedName("in_communal")
    @Expose
    @JsonProperty("in_communal")
    private Boolean inCommunal;
    @SerializedName("building_num")
    @Expose
    @JsonProperty("building_num")
    private Integer buildingNum;
    @SerializedName("phone_count")
    @Expose
    @JsonProperty("phone_count")
    private Object phoneCount;
    @SerializedName("gas")
    @Expose
    @JsonProperty("gas")
    private Boolean gas;
    @SerializedName("cable_tv")
    @Expose
    @JsonProperty("cable_tv")
    private Object cableTv;
    @SerializedName("door_phone")
    @Expose
    @JsonProperty("door_phone")
    private Object doorPhone;
    @SerializedName("satellite_tv")
    @Expose
    @JsonProperty("satellite_tv")
    private Object satelliteTv;
    @SerializedName("signalizing")
    @Expose
    @JsonProperty("signalizing")
    private Object signalizing;
    @SerializedName("internet")
    @Expose
    @JsonProperty("internet")
    private Object internet;
    @SerializedName("fire_prevention")
    @Expose
    @JsonProperty("fire_prevention")
    private Object firePrevention;
    @SerializedName("toilet_count")
    @Expose
    @JsonProperty("toilet_count")
    private Integer toiletCount;
    @SerializedName("square_house")
    @Expose
    @JsonProperty("square_house")
    private Integer squareHouse;

    @SerializedName("square_house_min")
    @Expose
    @JsonProperty("square_house_min")
    private Integer squareHouseMin;


    @SerializedName("square_living")
    @Expose
    @JsonProperty("square_living")
    private Integer squareLiving;
    @SerializedName("square_kitchen")
    @Expose
    @JsonProperty("square_kitchen")
    private Integer squareKitchen;
    @SerializedName("build_year")
    @Expose
    @JsonProperty("build_year")
    private Object buildYear;
    @SerializedName("height")
    @Expose
    @JsonProperty("height")
    private Object height;
    @SerializedName("available_metro")
    @Expose
    @JsonProperty("available_metro")
    private Object availableMetro;
    @SerializedName("available_bus_to_metro")
    @Expose
    @JsonProperty("available_bus_to_metro")
    private Object availableBusToMetro;
    @SerializedName("rent_communal_payment_id")
    @Expose
    @JsonProperty("rent_communal_payment_id")
    private Object rentCommunalPaymentId;
    @SerializedName("rent_term")
    @Expose
    @JsonProperty("rent_term")
    private Object rentTerm;
    @SerializedName("video_weblink")
    @Expose
    @JsonProperty("video_weblink")
    private Object videoWeblink;
    @SerializedName("mortgage")
    @Expose
    @JsonProperty("mortgage")
    private Boolean mortgage;
    @SerializedName("cadastral_number")
    @Expose
    @JsonProperty("cadastral_number")
    private Object cadastralNumber;
    @SerializedName("flat_num")
    @Expose
    @JsonProperty("flat_num")
    private Object flatNum;
    @SerializedName("id")
    @Expose
    @JsonProperty("id")
    private Long  id;
    @SerializedName("code")
    @Expose
    @JsonProperty("code")
    private Object code;
    @SerializedName("agent_id")
    @Expose
    @JsonProperty("agent_id")
    private Object agentId;
    @SerializedName("filial_id")
    @Expose
    @JsonProperty("filial_id")
    private Object filialId;
    @SerializedName("agency_id")
    @Expose
    @JsonProperty("agency_id")
    private Object agencyId;
    @SerializedName("server_dt")
    @Expose
    @JsonProperty("server_dt")
    private Date serverDt;
    @SerializedName("reg_dt")
    @Expose
    @JsonProperty("reg_dt")
    private Date regDt;
    @SerializedName("edit_dt")
    @Expose
    @JsonProperty("edit_dt")
    private Date editDt;
    @SerializedName("ref_city_id")
    @Expose
    @JsonProperty("ref_city_id")
    private Integer refCityId;

    @SerializedName("ref_city")
    @Expose
    @JsonProperty("ref_city")
    private RefCity refCity;

    @SerializedName("city")
    @Expose
    @JsonProperty("city")
    private City city;

    @SerializedName("region")
    @Expose
    @JsonProperty("region")
    private Region region;

    @SerializedName("master_city")
    @Expose
    @JsonProperty("master_city")
    private MasterCity masterCity;

    @SerializedName("district")
    @Expose
    @JsonProperty("district")
    private District district;

    @SerializedName("parent_district")
    @Expose
    @JsonProperty("parent_district")
    private ParentDistrict parentDistrict;

    @SerializedName("street")
    @Expose
    @JsonProperty("street")
    private Street street;

    @SerializedName("contact")
    @Expose
    @JsonProperty("contact")
    private Object contact;

    @SerializedName("furniture")
    @Expose
    @JsonProperty("furniture")
    private Set<Furniture> furniture;

    @SerializedName("household_technique")
    @Expose
    @JsonProperty("household_technique")
    private Set<HouseholdTechnique> householdTechnique;

    @SerializedName("balcony_arrangement")
    @Expose
    @JsonProperty("balcony_arrangement")
    private Object balconyArrangement;
    @SerializedName("parking")
    @Expose
    @JsonProperty("parking")
    private Object parking;
    @SerializedName("flat_type")
    @Expose
    @JsonProperty("flat_type")
    private FlatType flatType;
    @SerializedName("rent_currency")
    @Expose
    @JsonProperty("rent_currency")
    private RentCurrency rentCurrency;
    @SerializedName("rent_period")
    @Expose
    @JsonProperty("rent_period")
    private RentPeriod rentPeriod;
    @SerializedName("price_currency")
    @Expose
    @JsonProperty("price_currency")
    private PriceCurrency priceCurrency;
    @SerializedName("material_wall")
    @Expose
    @JsonProperty("material_wall")
    private MaterialWall materialWall;
    @SerializedName("building_material")
    @Expose
    @JsonProperty("building_material")
    private BuildingMaterial buildingMaterial;
    @SerializedName("photos")
    @Expose
    @JsonProperty("photos")
    private Set<String> photos;
    @SerializedName("photos_md5")
    @Expose
    @JsonProperty("photos_md5")
    private Set<PhotosMd5> photosMd5;
    @SerializedName("link")
    @Expose
    @JsonProperty("link")
    private String link;
    @SerializedName("phone")
    @Expose
    @JsonProperty("phone")
    private Object phone;
    @SerializedName("subregion")
    @Expose
    @JsonProperty("subregion")
    private Object subregion;
    @SerializedName("location")
    @Expose
    @JsonProperty("location")
    private Object location;

    @SerializedName("house_type_id")
    @Expose
    @JsonProperty("house_type_id")
    private Object houseTypeId;
    @SerializedName("house_part")
    @Expose
    @JsonProperty("house_part")
    private Object housePart;
    @SerializedName("heat_ids")
    @Expose
    @JsonProperty("heat_ids")
    private Object heatIds;
    @SerializedName("water_id")
    @Expose
    @JsonProperty("water_id")
    private Object waterId;
    @SerializedName("sewerage_id")
    @Expose
    @JsonProperty("sewerage_id")
    private Object sewerageId;
    @SerializedName("garage_id")
    @Expose
    @JsonProperty("garage_id")
    private Object garageId;
    @SerializedName("swimming_pool_id")
    @Expose
    @JsonProperty("swimming_pool_id")
    private Object swimmingPoolId;
    @SerializedName("bath_house_id")
    @Expose
    @JsonProperty("bath_house_id")
    private Object bathHouseId;
    @SerializedName("square_ground")
    @Expose
    @JsonProperty("square_ground")
    private Object squareGround;
    @SerializedName("square_ground_m2")
    @Expose
    @JsonProperty("square_ground_m2")
    private Object squareGroundM2;
    @SerializedName("square_ground_unit_id")
    @Expose
    @JsonProperty("square_ground_unit_id")
    private Object squareGroundUnitId;
    @SerializedName("heat")
    @Expose
    @JsonProperty("heat")
    private Object heat;
    @SerializedName("square_ground_unit")
    @Expose
    @JsonProperty("square_ground_unit")
    private Object squareGroundUnit;

    @SerializedName("street_name")
    @Expose
    @JsonProperty("street_name")
    private String streetName;
    @SerializedName("planning")
    @Expose
    @JsonProperty("planning")
    private Object planning;
    @SerializedName("toilet")
    @Expose
    @JsonProperty("toilet")
    private Object toilet;
    @SerializedName("state")
    @Expose
    @JsonProperty("state")
    private State state;
    @SerializedName("city_id")
    @Expose
    @JsonProperty("city_id")
    private Object cityId;
    @SerializedName("region_id")
    @Expose
    @JsonProperty("region_id")
    private Object regionId;
    @SerializedName("active_sale")
    @Expose
    @JsonProperty("active_sale")
    private Boolean activeSale;
    @SerializedName("active_rent")
    @Expose
    @JsonProperty("active_rent")
    private Boolean activeRent;
    @SerializedName("object_phone")
    @Expose
    @JsonProperty("object_phone")
    private String objectPhone;
    @SerializedName("publish_partner_ids")
    @Expose
    @JsonProperty("publish_partner_ids")
    private Set<Object> publishPartnerIds;
    @SerializedName("public_level_web_id")
    @Expose
    @JsonProperty("public_level_web_id")
    private Object publicLevelWebId;
    @SerializedName("state_id")
    @Expose
    @JsonProperty("state_id")
    private Integer stateId;
    @SerializedName("address_note")
    @Expose
    @JsonProperty("address_note")
    private String addressNote;
    @SerializedName("note_web")
    @Expose
    @JsonProperty("note_web")
    private String noteWeb;
    @SerializedName("note_excel")
    @Expose
    @JsonProperty("note_excel")
    private Object noteExcel;
    @SerializedName("int_possible")
    @Expose
    @JsonProperty("int_possible")
    private Boolean intPossible;
    @SerializedName("agreement_id")
    @Expose
    @JsonProperty("agreement_id")
    private Object agreementId;
    @SerializedName("status_id")
    @Expose
    @JsonProperty("status_id")
    private Object statusId;
    @SerializedName("owner_type_id")
    @Expose
    @JsonProperty("owner_type_id")
    private Object ownerTypeId;
    @SerializedName("realization_way_id")
    @Expose
    @JsonProperty("realization_way_id")
    private Object realizationWayId;
    @SerializedName("org_is_filial_divided")
    @Expose
    @JsonProperty("org_is_filial_divided")
    private Object orgIsFilialDivided;
    @SerializedName("agent_phone")
    @Expose
    @JsonProperty("agent_phone")
    private String agentPhone;
    @SerializedName("agent_name")
    @Expose
    @JsonProperty("agent_name")
    private Object agentName;
    @SerializedName("region_type_name")
    @Expose
    @JsonProperty("region_type_name")
    private Object regionTypeName;
    @SerializedName("longitude")
    @Expose
    @JsonProperty("longitude")
    private String longitude;
    @SerializedName("latitude")
    @Expose
    @JsonProperty("latitude")
    private String latitude;
    @SerializedName("master_city_id")
    @Expose
    @JsonProperty("master_city_id")
    private Object masterCityId;
    @SerializedName("subregion_id")
    @Expose
    @JsonProperty("subregion_id")
    private Object subregionId;
    @SerializedName("location_id")
    @Expose
    @JsonProperty("location_id")
    private Object locationId;
    @SerializedName("location_name")
    @Expose
    @JsonProperty("location_name")
    private Object locationName;
    @SerializedName("district_id")
    @Expose
    @JsonProperty("district_id")
    private Integer districtId;
    @SerializedName("street_id")
    @Expose
    @JsonProperty("street_id")
    private Object streetId;
    @SerializedName("metro_id")
    @Expose
    @JsonProperty("metro_id")
    private Object metroId;
    @SerializedName("corpus")
    @Expose
    @JsonProperty("corpus")
    private Object corpus;
    @SerializedName("remoteness_from_city")
    @Expose
    @JsonProperty("remoteness_from_city")
    private Object remotenessFromCity;
    @SerializedName("price_full")
    @Expose
    @JsonProperty("price_full")
    private String priceFull;
    @SerializedName("rent_full")
    @Expose
    @JsonProperty("rent_full")
    private String rentFull;
    @SerializedName("price_full_rur")
    @Expose
    @JsonProperty("price_full_rur")
    private String priceFullRur;
    @SerializedName("price_currency_id")
    @Expose
    @JsonProperty("price_currency_id")
    private String priceCurrencyId;
    @SerializedName("rent_currency_id")
    @Expose
    @JsonProperty("rent_currency_id")
    private String rentCurrencyId;
    @SerializedName("rent_period_id")
    @Expose
    @JsonProperty("rent_period_id")
    private String rentPeriodId;
    @SerializedName("rent_full_rur")
    @Expose
    @JsonProperty("rent_full_rur")
    private String rentFullRur;
    @SerializedName("publisher_params")
    @Expose
    @JsonProperty("publisher_params")
    private Object publisherParams;
    @SerializedName("data_class")
    @Expose
    @JsonProperty("data_class")
    private Integer dataClass;
    @SerializedName("agent")
    @Expose
    @JsonProperty("agent")
    private Agent agent;
    @SerializedName("org")
    @Expose
    @JsonProperty("org")
    private Organization org;
    @SerializedName("live_complex")
    @Expose
    @JsonProperty("live_complex")
    private LiveComplex liveComplex;
    @SerializedName("filial")
    @Expose
    @JsonProperty("filial")
    private Filial filial;
    @SerializedName("developer")
    @Expose
    @JsonProperty("developer")
    private Developer developer;

    public Integer getRoomCount() {
        return roomCount;
    }

    public String getRoomCountTotal() {
        return roomCountTotal;
    }

    public Integer getFlatTypeId() {
        return flatTypeId;
    }

    public Integer getObjectFloor() {
        return objectFloor;
    }

    public String getPlanningId() {
        return planningId;
    }

    public String getFloorCount() {
        return floorCount;
    }

    public Integer getObjectFloorMin() {
        return objectFloorMin;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public Integer getToiletId() {
        return toiletId;
    }

    public Integer getMaterialWallId() {
        return materialWallId;
    }

    public String getBuildingMaterialId() {
        return buildingMaterialId;
    }

    public Boolean isNewBuilding() {
        return newBuilding;
    }

    public String getDeliveryYear() {
        return deliveryYear;
    }

    public String getDeliveryQuarter() {
        return deliveryQuarter;
    }

    public String getDelivered() {
        return delivered;
    }

    public Boolean isActiveExchange() {
        return activeExchange;
    }

    public String getFirstFloorCommerce() {
        return firstFloorCommerce;
    }

    public String getGroundFloor() {
        return groundFloor;
    }

    public Integer getBuildingFloor() {
        return buildingFloor;
    }

    public Object getForCommerce() {
        return forCommerce;
    }

    public Integer getBalconyCount() {
        return balconyCount;
    }

    public Integer getLoggiaCount() {
        return loggiaCount;
    }

    public Set<Object> getHouseholdTechniqueIds() {
        return householdTechniqueIds;
    }

    public Set<Object> getBalconyArrangementIds() {
        return balconyArrangementIds;
    }

    public Set<Object> getFurnitureIds() {
        return furnitureIds;
    }

    public Set<Object> getParkingIds() {
        return parkingIds;
    }

    public Boolean isInCommunal() {
        return inCommunal;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public Object getPhoneCount() {
        return phoneCount;
    }

    public Boolean haveGas() {
        return gas;
    }

    public Object getCableTv() {
        return cableTv;
    }

    public Object getDoorPhone() {
        return doorPhone;
    }

    public Object getSatelliteTv() {
        return satelliteTv;
    }

    public Object getSignalizing() {
        return signalizing;
    }

    public Object getInternet() {
        return internet;
    }

    public Object getFirePrevention() {
        return firePrevention;
    }

    public Integer getToiletCount() {
        return toiletCount;
    }

    public Integer getSquareHouse() {
        return squareHouse;
    }

    public Integer getSquareHouseMin() {
        return squareHouseMin;
    }

    public Integer getSquareLiving() {
        return squareLiving;
    }

    public Integer getSquareKitchen() {
        return squareKitchen;
    }

    public Object getBuildYear() {
        return buildYear;
    }

    public Object getHeight() {
        return height;
    }

    public Object getAvailableMetro() {
        return availableMetro;
    }

    public Object getAvailableBusToMetro() {
        return availableBusToMetro;
    }

    public Object getRentCommunalPaymentId() {
        return rentCommunalPaymentId;
    }

    public Object getRentTerm() {
        return rentTerm;
    }

    public Object getVideoWeblink() {
        return videoWeblink;
    }

    public Boolean getMortgage() {
        return mortgage;
    }

    public Object getCadastralNumber() {
        return cadastralNumber;
    }

    public Object getFlatNum() {
        return flatNum;
    }

    public Long getId() {
        return id;
    }

    public Object getCode() {
        return code;
    }

    public Object getAgentId() {
        return agentId;
    }

    public Object getFilialId() {
        return filialId;
    }

    public Object getAgencyId() {
        return agencyId;
    }

    public Date getServerDt() {
        return serverDt;
    }

    public Date getRegDt() {
        return regDt;
    }

    public Date getEditDt() {
        return editDt;
    }

    public Integer getRefCityId() {
        return refCityId;
    }

    public RefCity getRefCity() {
        return refCity;
    }

    public City getCity() {
        return city;
    }

    public Region getRegion() {
        return region;
    }

    public MasterCity getMasterCity() {
        return masterCity;
    }

    public District getDistrict() {
        return district;
    }

    public ParentDistrict getParentDistrict() {
        return parentDistrict;
    }

    public Street getStreet() {
        return street;
    }

    public Object getContact() {
        return contact;
    }

    public Set<Furniture> getFurniture() {
        return furniture;
    }

    public Set<HouseholdTechnique> getHouseholdTechnique() {
        return householdTechnique;
    }

    public Object getBalconyArrangement() {
        return balconyArrangement;
    }

    public Object getParking() {
        return parking;
    }

    public FlatType getFlatType() {
        return flatType;
    }

    public RentCurrency getRentCurrency() {
        return rentCurrency;
    }

    public RentPeriod getRentPeriod() {
        return rentPeriod;
    }

    public PriceCurrency getPriceCurrency() {
        return priceCurrency;
    }

    public MaterialWall getMaterialWall() {
        return materialWall;
    }

    public BuildingMaterial getBuildingMaterial() {
        return buildingMaterial;
    }

    public Set<String> getPhotos() {
        return photos;
    }

    public Set<PhotosMd5> getPhotosMd5() {
        return photosMd5;
    }

    public String getLink() {
        return link;
    }

    public Object getPhone() {
        return phone;
    }

    public Object getSubregion() {
        return subregion;
    }

    public Object getLocation() {
        return location;
    }

    public Object getHouseTypeId() {
        return houseTypeId;
    }

    public Object getHousePart() {
        return housePart;
    }

    public Object getHeatIds() {
        return heatIds;
    }

    public Object getWaterId() {
        return waterId;
    }

    public Object getSewerageId() {
        return sewerageId;
    }

    public Object getGarageId() {
        return garageId;
    }

    public Object getSwimmingPoolId() {
        return swimmingPoolId;
    }

    public Object getBathHouseId() {
        return bathHouseId;
    }

    public Object getSquareGround() {
        return squareGround;
    }

    public Object getSquareGroundM2() {
        return squareGroundM2;
    }

    public Object getSquareGroundUnitId() {
        return squareGroundUnitId;
    }

    public Object getHeat() {
        return heat;
    }

    public Object getSquareGroundUnit() {
        return squareGroundUnit;
    }

    public String getStreetName() {
        return streetName;
    }

    public Object getPlanning() {
        return planning;
    }

    public Object getToilet() {
        return toilet;
    }

    public State getState() {
        return state;
    }

    public Object getCityId() {
        return cityId;
    }

    public Object getRegionId() {
        return regionId;
    }

    public Boolean isActiveSale() {
        return activeSale;
    }

    public Boolean isActiveRent() {
        return activeRent;
    }

    public String getObjectPhone() {
        return objectPhone;
    }

    public Set<Object> getPublishPartnerIds() {
        return publishPartnerIds;
    }

    public Object getPublicLevelWebId() {
        return publicLevelWebId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public String getAddressNote() {
        return addressNote;
    }

    public String getNoteWeb() {
        return noteWeb;
    }

    public Object getNoteExcel() {
        return noteExcel;
    }

    public Boolean getIntPossible() {
        return intPossible;
    }

    public Object getAgreementId() {
        return agreementId;
    }

    public Object getStatusId() {
        return statusId;
    }

    public Object getOwnerTypeId() {
        return ownerTypeId;
    }

    public Object getRealizationWayId() {
        return realizationWayId;
    }

    public Object getOrgIsFilialDivided() {
        return orgIsFilialDivided;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public Object getAgentName() {
        return agentName;
    }

    public Object getRegionTypeName() {
        return regionTypeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public Object getMasterCityId() {
        return masterCityId;
    }

    public Object getSubregionId() {
        return subregionId;
    }

    public Object getLocationId() {
        return locationId;
    }

    public Object getLocationName() {
        return locationName;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public Object getStreetId() {
        return streetId;
    }

    public Object getMetroId() {
        return metroId;
    }

    public Object getCorpus() {
        return corpus;
    }

    public Object getRemotenessFromCity() {
        return remotenessFromCity;
    }

    public String getPriceFull() {
        return priceFull;
    }

    public String getRentFull() {
        return rentFull;
    }

    public String getPriceFullRur() {
        return priceFullRur;
    }

    public String getPriceCurrencyId() {
        return priceCurrencyId;
    }

    public String getRentCurrencyId() {
        return rentCurrencyId;
    }

    public String getRentPeriodId() {
        return rentPeriodId;
    }

    public String getRentFullRur() {
        return rentFullRur;
    }

    public Object getPublisherParams() {
        return publisherParams;
    }

    public Integer getDataClass() {
        return dataClass;
    }

    public Agent getAgent() {
        return agent;
    }

    public Organization getOrg() {
        return org;
    }

    public LiveComplex getLiveComplex() {
        return liveComplex;
    }

    public Filial getFilial() {
        return filial;
    }

    public Developer getDeveloper() {
        return developer;
    }
}
