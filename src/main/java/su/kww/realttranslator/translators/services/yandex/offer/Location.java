package su.kww.realttranslator.translators.services.yandex.offer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {

    public Location(){
        country = "Россия";
    }
    private String country;
    private String region;
    @XmlElement(name="locality-name")
    private String localityName;
    @XmlElement(name="sub-locality-name")
    private String subLocalityName;
    private String address;
    private String latitude;
    private String longitude;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getSubLocalityName() {
        return subLocalityName;
    }

    public void setSubLocalityName(String subLocalityName) {
        this.subLocalityName = subLocalityName;
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
