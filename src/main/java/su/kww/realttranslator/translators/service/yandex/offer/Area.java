package su.kww.realttranslator.translators.service.yandex.offer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Area {


    private String value;
    private String unit;

    public Area(){}

    public Area(String value, String unit){
        this.value = value;
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
