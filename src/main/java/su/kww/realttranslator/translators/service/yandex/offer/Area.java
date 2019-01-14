package su.kww.realttranslator.translators.service.yandex.offer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Area {
    private String value;
    private String unit;
}
