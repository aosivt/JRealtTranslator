package su.kww.realttranslator.translators.service.yandex.offer;

public class YandexAdvert {
//        [JsonProperty("location")]
//    public YandexLocationItem Location { get; set; }
//
//        [JsonProperty("apartments")]
//    public bool Apartments { get; set; }
//
//        [JsonProperty("area")]
//    public int Square { get; set; }
//
//
//        [JsonProperty("balcony")]
//    public List<String> Balcony { get; set; }
//
//
//        [JsonProperty("bathroomUnit")]
//    public String BathroomUnit { get; set; }
//
//        [JsonProperty("builtYear")]
//    public int BuildYear { get; set; }
//
//    /// <summary>
//    /// Тип стен дома, обязательное поле
//    /// </summary>
//        [JsonProperty("buildingType")]
//    public String BuildingWallType { get; set; }
//
//    /// <summary>
//    /// Тип недвижимости, обязательное поле
//    /// </summary>
//        [JsonProperty("category")]
//    public String EstateType { get; set; }
//
//        [JsonProperty("ceilingHeight")]
//    public int Height { get; set; }
//
//        [JsonProperty("currency")]
//    public String Currency { get; set; }
//
//        [JsonProperty("dealType")]
//    public String DealType { get; set; }
//
//        [JsonProperty("description")]
//    public String Description { get; set; }
//
//    /// <summary>
//    /// Этаж квартиры
//    /// </summary>
//        [JsonProperty("floor")]
//    public int Floor { get; set; }
//
//        [JsonProperty("floorCovering")]
//    public String FloorCovering { get; set; }
//
//        [JsonProperty("floorsTotal")]
//    public int BuildingFloor { get; set; }
//
//    /// <summary>
//    /// Торг
//    /// </summary>
//        [JsonProperty("haggle")]
//    public bool Haggle { get; set; }
//
//
//        [JsonProperty("kitchenSpace")]
//    public int SquareKitchen { get; set; }
//
//        [JsonProperty("livingSpace")]
//    public int SquareLiving { get; set; }
//
//    /// <summary>
//    /// Только для комнат. Массив, содержащий площади каждой комнаты
//    /// </summary>
//        [JsonProperty("rooms")]
//    public List<int> SquareRooms { get; set; }
//
//
//    /// <summary>
//    /// Комнат в квартире, от 1 до 5
//    /// </summary>
//        [JsonProperty("roomsTotal")]
//    public String RoomsTotal { get; set; }
//
//    //[JsonProperty("studio")]
//    //public bool isStudio { get; set; }
//
//        [JsonProperty("newFlat")]
//    public bool isNotDelivered { get; set; }
//
//        [JsonProperty("lift")]
//    public bool isLiftExist { get; set; }
//        [JsonProperty("rubbishChute")]
//    public bool isGarbageExist { get; set; }
//        [JsonProperty("alarm")]
//    public bool isSecured { get; set; }
//
//        [JsonProperty("openPlan")]
//    public bool isOpenPlan { get; set; }
//
//
//        [JsonProperty("passBy")]
//    public bool isPassBy { get; set; }
//
//        [JsonProperty("parkingType")]
//    public String ParkingType { get; set; }
//
//
//        [JsonProperty("phone")]
//    public bool isPhoneInHouse { get; set; }
//
//        [JsonProperty("roomFurniture")]
//    public bool isWithFurniture { get; set; }
//
//        [JsonProperty("kitchenFurniture")]
//    public bool isWithKitchenFurniture { get; set; }
//
//        [JsonProperty("refrigerator")]
//    public bool isWithIcebox { get; set; }
//
//        [JsonProperty("washingMachine")]
//    public bool isWithWashingMachine { get; set; }
//        [JsonProperty("heatingSupply")]
//    public bool isWithHeat { get; set; }
//        [JsonProperty("gasSupply")]
//    public bool isWithGas { get; set; }
//
//        [JsonProperty("television")]
//    public bool isWithTV { get; set; }
//
//        [JsonProperty("internet")]
//    public bool isWithInternet { get; set; }
//
//        [JsonProperty("flatAlarm")]
//    public bool isWithSignalizing { get; set; }
//
//        [JsonProperty("waterSupply")]
//    public bool isWithWater { get; set; }
//
//        [JsonProperty("pool")]
//    public bool isWithSwimmingPool { get; set; }
//
//
//        [JsonProperty("windowViewToYard")]
//    public bool isWindowViewToYard { get; set; }
//
//        [JsonProperty("windowViewToStreet")]
//    public bool isWindowViewToStreet { get; set; }
//
//        [JsonProperty("sewerageSupply")]
//    public bool isWithSewerage { get; set; }
//
//        [JsonProperty("lotArea")]
//    public int LotArea { get; set; }
//
//        [JsonProperty("houseArea")]
//    public int HouseArea { get; set; }
//
//        [JsonProperty("houseFloors")]
//    public int HouseFloors { get; set; }
//
//
//
//        [JsonProperty("lotAreaUnit")]
//    public String LotAreaUnit { get; set; }
//
//        [JsonProperty("lotType")]
//    public String LotType { get; set; }
//    /// <summary>
//    /// Ипотека
//    /// </summary>
//        [JsonProperty("mortgage")]
//    public String Mortgage { get; set; }
//
//    /// <summary>
//    /// Тип предложения: продажа или сдача, обязательное поле
//    /// </summary>
//        [JsonProperty("type")]
//    public String OfferType { get; set; }
//
//        [JsonProperty("period")]
//    public String Period { get; set; }
//
//        [JsonProperty("photo")]
//    public List<String> Photos { get; set; }
//
//        [JsonProperty("price")]
//    public int Cost { get; set; }
//
//        [JsonProperty("renovation")]
//    public String Renovation { get; set; }
//
//        [JsonProperty("roomsOffered")]
//    public String RoomsOffered { get; set; }
//        [JsonProperty("roomsTotalApartment")]
//    public String RoomsTotalApartment { get; set; }
//
//        [JsonProperty("shower")]
//    public String Shower { get; set; }
//
//        [JsonIgnore()]
//    public String Telephone { get; set; }
//
//    //[JsonProperty("terms")]
//    //public bool Terms {get;set;}
//        [JsonProperty("toilet")]
//    public String Toilet { get; set; }
//
//        [JsonIgnore()]
//    public String ContactName { get; set; }
//
//        [JsonProperty("commercialType")]
//    public String CommercePurpose { get; set; }
//        [JsonProperty("commercialBuildingType")]
//    public String CommerceBuildingType { get; set; }
//        [JsonProperty("officeClass")]
//    public String CommerceClass { get; set; }
//
//    public YandexAdvert()
//    {
//
//    }

}
