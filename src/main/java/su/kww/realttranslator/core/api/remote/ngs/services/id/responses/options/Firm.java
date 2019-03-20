package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Firm {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("logo")
    @Expose
    private Object logo;
    @SerializedName("is_commercial_logo")
    @Expose
    private Object isCommercialLogo;
    @SerializedName("source")
    @Expose
    private Object source;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Object getIsCommercialLogo() {
        return isCommercialLogo;
    }

    public void setIsCommercialLogo(Object isCommercialLogo) {
        this.isCommercialLogo = isCommercialLogo;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

}