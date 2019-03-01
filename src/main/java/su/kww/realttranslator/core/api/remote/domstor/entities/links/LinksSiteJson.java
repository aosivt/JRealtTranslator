package su.kww.realttranslator.core.api.remote.domstor.entities.links;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Date;

public class LinksSiteJson {

    @SerializedName("SiteId")
    @Expose
    @JsonProperty("SiteId")
    private Integer siteId;
    @SerializedName("Type")
    @Expose
    @JsonProperty("Type")
    private Integer type;
    @SerializedName("DomstorId")
    @Expose
    @JsonProperty("DomstorId")
    private Long domstorId;
    @SerializedName("Operation")
    @Expose
    @JsonProperty("Operation")
    private Integer operation;
    @SerializedName("Loaded")
    @Expose
    @JsonProperty("Loaded")
    private Boolean loaded;
    @SerializedName("ExternalId")
    @Expose
    @JsonProperty("ExternalId")
    private String externalId;
    @SerializedName("AdvertEditDate")
    @Expose
    @JsonProperty("AdvertEditDate")
    private Date advertEditDate;
    @SerializedName("Version")
    @Expose
    @JsonProperty("Version")
    private Integer version;
    @SerializedName("ExternalUrl")
    @Expose
    @JsonProperty("ExternalUrl")
    private String externalUrl;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getDomstorId() {
        return domstorId;
    }

    public void setDomstorId(Long domstorId) {
        this.domstorId = domstorId;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Boolean getLoaded() {
        return loaded;
    }

    public void setLoaded(Boolean loaded) {
        this.loaded = loaded;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Date getAdvertEditDate() {
        return advertEditDate;
    }

    public void setAdvertEditDate(Date advertEditDate) {
        this.advertEditDate = advertEditDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }


}
