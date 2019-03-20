package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Params__ {

    @SerializedName("realty_id")
    @Expose
    private Integer realtyId;
    @SerializedName("billing_id")
    @Expose
    private Integer billingId;
    @SerializedName("domain")
    @Expose
    private String domain;

    public Integer getRealtyId() {
        return realtyId;
    }

    public void setRealtyId(Integer realtyId) {
        this.realtyId = realtyId;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

}
