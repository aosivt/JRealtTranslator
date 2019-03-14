package su.kww.realttranslator.translators.services.avito.offer;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.Set;

@XmlRootElement(name="Ads")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvitoAdvert {
    @XmlAttribute(name = "target")
    private String target;
    @XmlAttribute(name="formatVersion")
    private String formatVersion;

    @XmlElement(name="Ad")
    private Set<AvitoAdvertOffer> offer;

    public AvitoAdvert(){
        target = "Avito.ru";
        formatVersion = "3";
    }

    public String getTarget() {
        return target;
    }

    public String getFormatVersion() {
        return formatVersion;
    }

    public Set<AvitoAdvertOffer> getOffer() {
        return offer;
    }

    public void setOffer(Set<AvitoAdvertOffer> offer) {
        this.offer = offer;
    }
}
