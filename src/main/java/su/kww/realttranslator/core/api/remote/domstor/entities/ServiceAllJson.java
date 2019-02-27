package su.kww.realttranslator.core.api.remote.domstor.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.org.apache.xpath.internal.operations.Bool;
import su.kww.realttranslator.core.api.remote.domstor.entities.address.*;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_feed_object.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class ServiceAllJson implements Serializable {

    @SerializedName("room_count")
    @Expose
    @JsonProperty("room_count")
    private Integer room_count;
    @SerializedName("room_count_total")
    @Expose
    @JsonProperty("room_count_total")
    private String room_count_total;
    @SerializedName("flat_type_id")
    @Expose
    @JsonProperty("flat_type_id")
    private Integer flat_type_id;
    @SerializedName("object_floor")
    @Expose
    @JsonProperty("object_floor")
    private Integer object_floor;
    @SerializedName("planning_id")
    @Expose
    @JsonProperty("planning_id")
    private String planning_id;
    @SerializedName("floor_count")
    @Expose
    @JsonProperty("floor_count")
    private String floor_count;

    @SerializedName("object_floor_min")
    @Expose
    @JsonProperty("object_floor_min")
    private Integer objectFloorMin;


    @SerializedName("phone_id")
    @Expose
    @JsonProperty("phone_id")
    private String phone_id;
    @SerializedName("toilet_id")
    @Expose
    @JsonProperty("toilet_id")
    private Integer toilet_id;
    @SerializedName("material_wall_id")
    @Expose
    @JsonProperty("material_wall_id")
    private Integer material_wall_id;
    @SerializedName("building_material_id")
    @Expose
    @JsonProperty("building_material_id")
    private String building_material_id;
    @SerializedName("new_building")
    @Expose
    @JsonProperty("new_building")
    private Boolean new_building;
    @SerializedName("delivery_year")
    @Expose
    @JsonProperty("delivery_year")
    private String delivery_year;
    @SerializedName("delivery_quarter")
    @Expose
    @JsonProperty("delivery_quarter")
    private String delivery_quarter;
    @SerializedName("delivered")
    @Expose
    @JsonProperty("delivered")
    private String delivered;
    @SerializedName("active_exchange")
    @Expose
    @JsonProperty("active_exchange")
    private Boolean active_exchange;
    @SerializedName("first_floor_commerce")
    @Expose
    @JsonProperty("first_floor_commerce")
    private String first_floor_commerce;
    @SerializedName("ground_floor")
    @Expose
    @JsonProperty("ground_floor")
    private String ground_floor;
    @SerializedName("building_floor")
    @Expose
    @JsonProperty("building_floor")
    private Integer building_floor;
    @SerializedName("for_commerce")
    @Expose
    @JsonProperty("for_commerce")
    private Object for_commerce;
    @SerializedName("balcony_count")
    @Expose
    @JsonProperty("balcony_count")
    private Integer balcony_count;
    @SerializedName("loggia_count")
    @Expose
    @JsonProperty("loggia_count")
    private Integer loggia_count;
    @SerializedName("household_technique_ids")
    @Expose
    @JsonProperty("household_technique_ids")
    private Set<Object> household_technique_ids;
    @SerializedName("balcony_arrangement_ids")
    @Expose
    @JsonProperty("balcony_arrangement_ids")
    private Set<Object> balcony_arrangement_ids;
    @SerializedName("furniture_ids")
    @Expose
    @JsonProperty("furniture_ids")
    private Set<Object>furniture_ids;
    @SerializedName("parking_ids")
    @Expose
    @JsonProperty("parking_ids")
    private Set<Object>parking_ids;
    @SerializedName("in_communal")
    @Expose
    @JsonProperty("in_communal")
    private Boolean in_communal;
    @SerializedName("building_num")
    @Expose
    @JsonProperty("building_num")
    private Integer building_num;
    @SerializedName("phone_count")
    @Expose
    @JsonProperty("phone_count")
    private Object phone_count;
    @SerializedName("gas")
    @Expose
    @JsonProperty("gas")
    private Boolean gas;
    @SerializedName("cable_tv")
    @Expose
    @JsonProperty("cable_tv")
    private Object cable_tv;
    @SerializedName("door_phone")
    @Expose
    @JsonProperty("door_phone")
    private Object door_phone;
    @SerializedName("satellite_tv")
    @Expose
    @JsonProperty("satellite_tv")
    private Object satellite_tv;
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
    private Integer toilet_count;
    @SerializedName("square_house")
    @Expose
    @JsonProperty("square_house")
    private Integer square_house;

    @SerializedName("square_house_min")
    @Expose
    @JsonProperty("square_house_min")
    private Integer squareHouseMin;


    @SerializedName("square_living")
    @Expose
    @JsonProperty("square_living")
    private Integer square_living;
    @SerializedName("square_kitchen")
    @Expose
    @JsonProperty("square_kitchen")
    private Integer square_kitchen;
    @SerializedName("build_year")
    @Expose
    @JsonProperty("build_year")
    private Object build_year;
    @SerializedName("height")
    @Expose
    @JsonProperty("height")
    private Object height;
    @SerializedName("available_metro")
    @Expose
    @JsonProperty("available_metro")
    private Object available_metro;
    @SerializedName("available_bus_to_metro")
    @Expose
    @JsonProperty("available_bus_to_metro")
    private Object available_bus_to_metro;
    @SerializedName("rent_communal_payment_id")
    @Expose
    @JsonProperty("rent_communal_payment_id")
    private Object rent_communal_payment_id;
    @SerializedName("rent_term")
    @Expose
    @JsonProperty("rent_term")
    private Object rent_term;
    @SerializedName("video_weblink")
    @Expose
    @JsonProperty("video_weblink")
    private Object video_weblink;
    @SerializedName("mortgage")
    @Expose
    @JsonProperty("mortgage")
    private Boolean mortgage;
    @SerializedName("cadastral_number")
    @Expose
    @JsonProperty("cadastral_number")
    private Object cadastral_number;
    @SerializedName("flat_num")
    @Expose
    @JsonProperty("flat_num")
    private Object flat_num;
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
    private Object agent_id;
    @SerializedName("filial_id")
    @Expose
    @JsonProperty("filial_id")
    private Object filial_id;
    @SerializedName("agency_id")
    @Expose
    @JsonProperty("agency_id")
    private Object agency_id;
    @SerializedName("server_dt")
    @Expose
    @JsonProperty("server_dt")
    private Date server_dt;
    @SerializedName("reg_dt")
    @Expose
    @JsonProperty("reg_dt")
    private Date reg_dt;
    @SerializedName("edit_dt")
    @Expose
    @JsonProperty("edit_dt")
    private Date edit_dt;
    @SerializedName("ref_city_id")
    @Expose
    @JsonProperty("ref_city_id")
    private Integer ref_city_id;

    @SerializedName("ref_city")
    @Expose
    @JsonProperty("ref_city")
    private RefCity ref_city;

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
    private MasterCity master_city;

    @SerializedName("district")
    @Expose
    @JsonProperty("district")
    private District district;

    @SerializedName("parent_district")
    @Expose
    @JsonProperty("parent_district")
    private ParentDistrict parent_district;

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
    private Set<HouseholdTechnique> household_technique;

    @SerializedName("balcony_arrangement")
    @Expose
    @JsonProperty("balcony_arrangement")
    private Object balcony_arrangement;
    @SerializedName("parking")
    @Expose
    @JsonProperty("parking")
    private Object parking;
    @SerializedName("flat_type")
    @Expose
    @JsonProperty("flat_type")
    private FlatType flat_type;
    @SerializedName("rent_currency")
    @Expose
    @JsonProperty("rent_currency")
    private RentCurrency rent_currency;
    @SerializedName("rent_period")
    @Expose
    @JsonProperty("rent_period")
    private RentPeriod rentPeriod;
    @SerializedName("price_currency")
    @Expose
    @JsonProperty("price_currency")
    private PriceCurrency price_currency;
    @SerializedName("material_wall")
    @Expose
    @JsonProperty("material_wall")
    private MaterialWall material_wall;
    @SerializedName("building_material")
    @Expose
    @JsonProperty("building_material")
    private BuildingMaterial building_material;
    @SerializedName("photos")
    @Expose
    @JsonProperty("photos")
    private Set<String> photos;
    @SerializedName("photos_md5")
    @Expose
    @JsonProperty("photos_md5")
    private Set<PhotosMd5> photos_md5;
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
    private Object house_type_id;
    @SerializedName("house_part")
    @Expose
    @JsonProperty("house_part")
    private Object housePart;
    @SerializedName("heat_ids")
    @Expose
    @JsonProperty("heat_ids")
    private Object heat_ids;
    @SerializedName("water_id")
    @Expose
    @JsonProperty("water_id")
    private Object water_id;
    @SerializedName("sewerage_id")
    @Expose
    @JsonProperty("sewerage_id")
    private Object sewerage_id;
    @SerializedName("garage_id")
    @Expose
    @JsonProperty("garage_id")
    private Object garage_id;
    @SerializedName("swimming_pool_id")
    @Expose
    @JsonProperty("swimming_pool_id")
    private Object swimmingPool_id;
    @SerializedName("bath_house_id")
    @Expose
    @JsonProperty("bath_house_id")
    private Object bathHouse_id;
    @SerializedName("square_ground")
    @Expose
    @JsonProperty("square_ground")
    private Object squareGround;
    @SerializedName("square_ground_m2")
    @Expose
    @JsonProperty("square_ground_m2")
    private Object square_ground_m2;
    @SerializedName("square_ground_unit_id")
    @Expose
    @JsonProperty("square_ground_unit_id")
    private Object square_ground_unit_id;
    @SerializedName("heat")
    @Expose
    @JsonProperty("heat")
    private Object heat;
    @SerializedName("square_ground_unit")
    @Expose
    @JsonProperty("square_ground_unit")
    private Object square_ground_unit;

    @SerializedName("street_name")
    @Expose
    @JsonProperty("street_name")
    private String street_name;
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
    private Object city_id;
    @SerializedName("region_id")
    @Expose
    @JsonProperty("region_id")
    private Object region_id;
    @SerializedName("active_sale")
    @Expose
    @JsonProperty("active_sale")
    private Boolean active_sale;
    @SerializedName("active_rent")
    @Expose
    @JsonProperty("active_rent")
    private Boolean active_rent;
    @SerializedName("object_phone")
    @Expose
    @JsonProperty("object_phone")
    private String object_phone;
    @SerializedName("publish_partner_ids")
    @Expose
    @JsonProperty("publish_partner_ids")
    private Set<Object> publish_partner_ids;
    @SerializedName("public_level_web_id")
    @Expose
    @JsonProperty("public_level_web_id")
    private Object public_level_web_id;
    @SerializedName("state_id")
    @Expose
    @JsonProperty("state_id")
    private Integer state_id;
    @SerializedName("address_note")
    @Expose
    @JsonProperty("address_note")
    private String address_note;
    @SerializedName("note_web")
    @Expose
    @JsonProperty("note_web")
    private String note_web;
    @SerializedName("note_excel")
    @Expose
    @JsonProperty("note_excel")
    private Object note_excel;
    @SerializedName("int_possible")
    @Expose
    @JsonProperty("int_possible")
    private Boolean int_possible;
    @SerializedName("agreement_id")
    @Expose
    @JsonProperty("agreement_id")
    private Object agreement_id;
    @SerializedName("status_id")
    @Expose
    @JsonProperty("status_id")
    private Object status_id;
    @SerializedName("owner_type_id")
    @Expose
    @JsonProperty("owner_type_id")
    private Object owner_type_id;
    @SerializedName("realization_way_id")
    @Expose
    @JsonProperty("realization_way_id")
    private Object realization_way_id;
    @SerializedName("org_is_filial_divided")
    @Expose
    @JsonProperty("org_is_filial_divided")
    private Object org_is_filial_divided;
    @SerializedName("agent_phone")
    @Expose
    @JsonProperty("agent_phone")
    private String agent_phone;
    @SerializedName("agent_name")
    @Expose
    @JsonProperty("agent_name")
    private Object agent_name;
    @SerializedName("region_type_name")
    @Expose
    @JsonProperty("region_type_name")
    private Object region_type_name;
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
    private Object master_city_id;
    @SerializedName("subregion_id")
    @Expose
    @JsonProperty("subregion_id")
    private Object subregion_id;
    @SerializedName("location_id")
    @Expose
    @JsonProperty("location_id")
    private Object location_id;
    @SerializedName("location_name")
    @Expose
    @JsonProperty("location_name")
    private Object location_name;
    @SerializedName("district_id")
    @Expose
    @JsonProperty("district_id")
    private Integer district_id;
    @SerializedName("street_id")
    @Expose
    @JsonProperty("street_id")
    private Object street_id;
    @SerializedName("metro_id")
    @Expose
    @JsonProperty("metro_id")
    private Object metro_id;
    @SerializedName("corpus")
    @Expose
    @JsonProperty("corpus")
    private Object corpus;
    @SerializedName("remoteness_from_city")
    @Expose
    @JsonProperty("remoteness_from_city")
    private Object remoteness_from_city;
    @SerializedName("price_full")
    @Expose
    @JsonProperty("price_full")
    private String price_full;
    @SerializedName("rent_full")
    @Expose
    @JsonProperty("rent_full")
    private String rent_full;
    @SerializedName("price_full_rur")
    @Expose
    @JsonProperty("price_full_rur")
    private String price_full_rur;
    @SerializedName("price_currency_id")
    @Expose
    @JsonProperty("price_currency_id")
    private String price_currency_id;
    @SerializedName("rent_currency_id")
    @Expose
    @JsonProperty("rent_currency_id")
    private String rent_currency_id;
    @SerializedName("rent_period_id")
    @Expose
    @JsonProperty("rent_period_id")
    private String rent_period_id;
    @SerializedName("rent_full_rur")
    @Expose
    @JsonProperty("rent_full_rur")
    private String rent_full_rur;
    @SerializedName("publisher_params")
    @Expose
    @JsonProperty("publisher_params")
    private Object publisher_params;
    @SerializedName("data_class")
    @Expose
    @JsonProperty("data_class")
    private Integer data_class;
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
    private LiveComplex live_complex;
    @SerializedName("filial")
    @Expose
    @JsonProperty("filial")
    private Filial filial;
    @SerializedName("developer")
    @Expose
    @JsonProperty("developer")
    private Developer developer;

    public Integer getRoom_count() {
        return room_count;
    }

    public String getRoom_count_total() {
        return room_count_total;
    }

    public Integer getFlat_type_id() {
        return flat_type_id;
    }

    public Integer getObject_floor() {
        return object_floor;
    }

    public String getPlanning_id() {
        return planning_id;
    }

    public String getFloor_count() {
        return floor_count;
    }

    public Integer getObjectFloorMin() {
        return objectFloorMin;
    }

    public String getPhone_id() {
        return phone_id;
    }

    public Integer getToilet_id() {
        return toilet_id;
    }

    public Integer getMaterial_wall_id() {
        return material_wall_id;
    }

    public String getBuilding_material_id() {
        return building_material_id;
    }

    public Boolean getNew_building() {
        return new_building;
    }

    public String getDelivery_year() {
        return delivery_year;
    }

    public String getDelivery_quarter() {
        return delivery_quarter;
    }

    public String getDelivered() {
        return delivered;
    }

    public Boolean getActive_exchange() {
        return active_exchange;
    }

    public String getFirst_floor_commerce() {
        return first_floor_commerce;
    }

    public String getGround_floor() {
        return ground_floor;
    }

    public Integer getBuilding_floor() {
        return building_floor;
    }

    public Object getFor_commerce() {
        return for_commerce;
    }

    public Integer getBalcony_count() {
        return balcony_count;
    }

    public Integer getLoggia_count() {
        return loggia_count;
    }

    public Set<Object> getHousehold_technique_ids() {
        return household_technique_ids;
    }

    public Set<Object> getBalcony_arrangement_ids() {
        return balcony_arrangement_ids;
    }

    public Set<Object> getFurniture_ids() {
        return furniture_ids;
    }

    public Set<Object> getParking_ids() {
        return parking_ids;
    }

    public Boolean getIn_communal() {
        return in_communal;
    }

    public Integer getBuilding_num() {
        return building_num;
    }

    public Object getPhone_count() {
        return phone_count;
    }

    public Boolean getGas() {
        return gas;
    }

    public Object getCable_tv() {
        return cable_tv;
    }

    public Object getDoor_phone() {
        return door_phone;
    }

    public Object getSatellite_tv() {
        return satellite_tv;
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

    public Integer getToilet_count() {
        return toilet_count;
    }

    public Integer getSquare_house() {
        return square_house;
    }

    public Integer getSquare_living() {
        return square_living;
    }

    public Integer getSquare_kitchen() {
        return square_kitchen;
    }

    public Object getBuild_year() {
        return build_year;
    }

    public Object getHeight() {
        return height;
    }

    public Object getAvailable_metro() {
        return available_metro;
    }

    public Object getAvailable_bus_to_metro() {
        return available_bus_to_metro;
    }

    public Object getRent_communal_payment_id() {
        return rent_communal_payment_id;
    }

    public Object getRent_term() {
        return rent_term;
    }

    public Object getVideo_weblink() {
        return video_weblink;
    }

    public Boolean getMortgage() {
        return mortgage;
    }

    public Object getCadastral_number() {
        return cadastral_number;
    }

    public Object getFlat_num() {
        return flat_num;
    }

    public Long getId() {
        return id;
    }

    public Object getCode() {
        return code;
    }

    public Object getAgent_id() {
        return agent_id;
    }

    public Object getFilial_id() {
        return filial_id;
    }

    public Object getAgency_id() {
        return agency_id;
    }

    public Date getServer_dt() {
        return server_dt;
    }

    public Date getReg_dt() {
        return reg_dt;
    }

    public Date getEdit_dt() {
        return edit_dt;
    }

    public Integer getRef_city_id() {
        return ref_city_id;
    }

    public RefCity getRef_city() {
        return ref_city;
    }

    public City getCity() {
        return city;
    }

    public Region getRegion() {
        return region;
    }

    public MasterCity getMaster_city() {
        return master_city;
    }

    public District getDistrict() {
        return district;
    }

    public ParentDistrict getParent_district() {
        return parent_district;
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

    public Set<HouseholdTechnique> getHousehold_technique() {
        return household_technique;
    }

    public Object getBalcony_arrangement() {
        return balcony_arrangement;
    }

    public Object getParking() {
        return parking;
    }

    public FlatType getFlat_type() {
        return flat_type;
    }

    public RentCurrency getRent_currency() {
        return rent_currency;
    }

    public RentPeriod getRentPeriod() {
        return rentPeriod;
    }

    public PriceCurrency getPrice_currency() {
        return price_currency;
    }

    public MaterialWall getMaterial_wall() {
        return material_wall;
    }

    public BuildingMaterial getBuilding_material() {
        return building_material;
    }

    public Set<String> getPhotos() {
        return photos;
    }

    public Set<PhotosMd5> getPhotos_md5() {
        return photos_md5;
    }

    public String getLink() {
        return link;
    }

    public Object getSubregion() {
        return subregion;
    }

    public Object getLocation() {
        return location;
    }

    public Object getHouse_type_id() {
        return house_type_id;
    }

    public Object getHousePart() {
        return housePart;
    }

    public Object getHeat_ids() {
        return heat_ids;
    }

    public Object getWater_id() {
        return water_id;
    }

    public Object getSewerage_id() {
        return sewerage_id;
    }

    public Object getGarage_id() {
        return garage_id;
    }

    public Object getSwimmingPool_id() {
        return swimmingPool_id;
    }

    public Object getBathHouse_id() {
        return bathHouse_id;
    }

    public Object getSquareGround() {
        return squareGround;
    }

    public Object getSquare_ground_m2() {
        return square_ground_m2;
    }

    public Object getSquare_ground_unit_id() {
        return square_ground_unit_id;
    }

    public Object getHeat() {
        return heat;
    }

    public Object getSquare_ground_unit() {
        return square_ground_unit;
    }

    public String getStreet_name() {
        return street_name;
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

    public Object getCity_id() {
        return city_id;
    }

    public Object getRegion_id() {
        return region_id;
    }

    public Boolean getActive_sale() {
        return active_sale;
    }

    public Boolean getActive_rent() {
        return active_rent;
    }

    public String getObject_phone() {
        return object_phone;
    }

    public Set<Object> getPublish_partner_ids() {
        return publish_partner_ids;
    }

    public Object getPublic_level_web_id() {
        return public_level_web_id;
    }

    public Integer getState_id() {
        return state_id;
    }

    public String getAddress_note() {
        return address_note;
    }

    public String getNote_web() {
        return note_web;
    }

    public Object getNote_excel() {
        return note_excel;
    }

    public Boolean getInt_possible() {
        return int_possible;
    }

    public Object getAgreement_id() {
        return agreement_id;
    }

    public Object getStatus_id() {
        return status_id;
    }

    public Object getOwner_type_id() {
        return owner_type_id;
    }

    public Object getRealization_way_id() {
        return realization_way_id;
    }

    public Object getOrg_is_filial_divided() {
        return org_is_filial_divided;
    }

    public String getAgent_phone() {
        return agent_phone;
    }

    public Object getAgent_name() {
        return agent_name;
    }

    public Object getRegion_type_name() {
        return region_type_name;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public Object getMaster_city_id() {
        return master_city_id;
    }

    public Object getSubregion_id() {
        return subregion_id;
    }

    public Object getLocation_id() {
        return location_id;
    }

    public Object getLocation_name() {
        return location_name;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public Object getStreet_id() {
        return street_id;
    }

    public Object getMetro_id() {
        return metro_id;
    }

    public Object getCorpus() {
        return corpus;
    }

    public Object getRemoteness_from_city() {
        return remoteness_from_city;
    }

    public String getPrice_full() {
        return price_full;
    }

    public String getRent_full() {
        return rent_full;
    }

    public String getPrice_full_rur() {
        return price_full_rur;
    }

    public String getPrice_currency_id() {
        return price_currency_id;
    }

    public String getRent_currency_id() {
        return rent_currency_id;
    }

    public String getRent_period_id() {
        return rent_period_id;
    }

    public String getRent_full_rur() {
        return rent_full_rur;
    }

    public Object getPublisher_params() {
        return publisher_params;
    }

    public Integer getData_class() {
        return data_class;
    }

    public Agent getAgent() {
        return agent;
    }

    public Organization getOrg() {
        return org;
    }

    public LiveComplex getLive_complex() {
        return live_complex;
    }

    public Filial getFilial() {
        return filial;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Object getPhone() {
        return phone;
    }

    public Integer getSquareHouseMin() {
        return squareHouseMin;
    }
}
