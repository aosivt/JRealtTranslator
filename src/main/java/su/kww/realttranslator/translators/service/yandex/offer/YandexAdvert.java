package su.kww.realttranslator.translators.service.yandex.offer;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.Set;

@XmlRootElement(name="realty-feed")
@XmlAccessorType(XmlAccessType.FIELD)
public class YandexAdvert {
    @XmlAttribute(name = "xmlns")
    private String xmlns;
    @XmlElement(name="generation-date")
    private Date generationDate;

    private Set<YandexAdvertOffer> offer;

    public YandexAdvert(){
        xmlns = "http://webmaster.yandex.ru/schemas/feed/realty/2010-06";
        generationDate = new Date();
    }

    public String getXmlns() {
        return xmlns;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public Set<YandexAdvertOffer> getOffer() {
        return offer;
    }

    public void setOffer(Set<YandexAdvertOffer> offer) {
        this.offer = offer;
    }
}
