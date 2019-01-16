package su.kww.realttranslator.core.model;

public class MessageProvider {
    public String errorCommonAdvert() {
        return "Ошибка трансляции объявления";
    }

    public String emptyNoteWeb() {
        return "Введите описание объекта";
    }

    public String emptyStreet() {
        return "Укажите улицу";
    }

    public String emptyLocation() {
        return "Укажите населенный пункт";
    }

    public String emptyObjectFloor() {
        return "Укажите этаж объекта";
    }

    public String emptyBuildingFloor() {
        return "Укажите этаж строения";
    }

    public String wrongBuildingFloorRange(Double currentFloor, Double min, Double max) {
        return String.format("Этаж строения должен быть от %s до %s, у вас: %s", min, max, currentFloor);
    }

    public String wrongObjectFloorRange(Double currentFloor, Double min, Double max) {
        return String.format("Этаж объекта должен быть от %s до %s, у вас: %s", min, max, currentFloor);
    }

    public String emptySquare() {
        return "Укажите площадь помещения";
    }

    public String emptySquareGround() {
        return "Укажите площадь земли";
    }

    public String emptyRoomCount() {
        return "Укажите количество комнат";
    }

    public String emptyBuildingMaterial() {
        return "Укажите материал строения";
    }

    public String emptyObjectMaterial() {
        return "Укажите материал объекта";
    }

    public String wrongPhoneNumber(String phone) {
        return String.format("Неверно указан номер телефона: %s. Указывайте номера телефонов в федеральном формате через запятую", phone);
    }

    public String emptyRegion() {
        return "Укажите регион объекта";
    }

    public String emptyDistrict() {
        return "Укажите район города, в котором располагается объект";
    }

    public String wrongNoteWebLenght(Double lenght, Double min, Double max) {
        return String.format("Текст объявления должен быть от %s до %s символов, у вас: %s", min, max, lenght);
    }

    public String wrongSquareRange(Double currentSquare, Double min, Double max) {
        return String.format("Площадь объекта должна быть от %s до %s, у вас: %s", min, max, currentSquare);
    }

    public String WrongSquareGroundRange(Double currentSquare, Double min, Double max) {
        return String.format("Площадь земли должна быть от %s до %s, у вас: %s", min, max, currentSquare);
    }

    public String emptyRentPeriod() {
        return "Укажите период сдачи объекта";
    }

    public String wrongRemotenessFromCityRange(Double currentRemoteness, Double min, Double max) {
        return String.format("Расстояние до города должно быть от %s до %s, у вас: %s", min, max, currentRemoteness);
    }

    public String wrongRoomCountRange(double current, double min, double max) {
        return String.format("Количество комнат должно быть от %s до %s, у вас: %s", min, max, current);
    }

    public String cantEditValue(String name, String siteValue, String translatorValue) {
        return String.format("Правила сайта запрещают редактирование поля  \"%s\". Значение на сайте \"%s\", в трансляторе \"%s\"", name, siteValue, translatorValue);
    }

    public String cantEditValue(String name) {
        return String.format("Правила сайта запрещают редактирование поля  \"%s\"", name);
    }

    public String blocked() {
        return "Объявление было заблокировано";
    }

    public String deleted() {
        return "Такого объекта на сайте не существует. Возможно вы уже удалили его вручную.";
    }

    public String wrongPriceRange(Double current, Double min, Double max) {
        return String.format("Цена должна быть от %s до %s, у вас: %s", min, max, current);
    }

    public String wrongAuth() {
        return "Не удалось авторизоваться на ресурсе";
    }

    public String emptyPrice() {
        return "Укажите цену объекта";
    }

    public String wrongLocation(String city) {
        return String.format("Населенного пункта \"%s\" нет в списке доступных для размещения", city);
    }

    public String wrongStreet(String street) {
        return String.format("Улицы  \"%s\" нет в списке доступных для размещения", street);
    }

    public String emptyHouseType() {
        return "Укажите тип дома";
    }

    public String emptyCommerceType() {
        return "Укажите тип коммерческой недвижимости";
    }

    public String emptyFlatType() {
        return "Укажите тип квартиры";
    }

    public String emptyLandType() {
        return "Укажите тип земельного участка";
    }

    public String emptyGarageType() {
        return "Укажите тип гаража";
    }

    public String wrongRoomCountRange(Integer min, Integer max, Integer current) {
        return String.format("Количество комнат должно быть %s от 1 до %s, у вас %s", min, max, current);
    }

    public String wrongDistrict(String district) {
        return String.format("Района \"%s\" нет в списке доступных для размещения", district);
    }

    public String wrongRegion(String region) {
        return String.format("Региона \"%s\" нет в списке доступных для размещения", region);
    }

    public String wrongSubregion(String subregion) {
        return String.format("Района региона \"%s\" нет в списке доступных для размещения", subregion);
    }

    public String emptyBuildingNum() {
        return "Укажите номер дома";
    }

    public String emptyDelivery() {
        return "Укажите срок сдачи новостройки";
    }
}
