package su.kww.realttranslator.translators.service.yandex.offer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name="sales-agent")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesAgent {
    private String name;
    private Set<String> phone;
    private String category;
    private String organization;
    private Integer agencyId; //agency-id
    private String email;
    private String partner;
}
