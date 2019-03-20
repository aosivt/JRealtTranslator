package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainPhoto {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("original")
    @Expose
    private String original;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url_mask")
    @Expose
    private String urlMask;
    @SerializedName("is_cover")
    @Expose
    private Boolean isCover;
    @SerializedName("is_facade")
    @Expose
    private Boolean isFacade;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("old_id")
    @Expose
    private String oldId;
    @SerializedName("1200x900p")
    @Expose
    private String _1200x900p;
    @SerializedName("834x624p")
    @Expose
    private String _834x624p;
    @SerializedName("360x270cp")
    @Expose
    private String _360x270cp;
    @SerializedName("258x193cp")
    @Expose
    private String _258x193cp;
    @SerializedName("216x162cp")
    @Expose
    private String _216x162cp;
    @SerializedName("144x108cp")
    @Expose
    private String _144x108cp;
    @SerializedName("70x70cp")
    @Expose
    private String _70x70cp;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlMask() {
        return urlMask;
    }

    public void setUrlMask(String urlMask) {
        this.urlMask = urlMask;
    }

    public Boolean getIsCover() {
        return isCover;
    }

    public void setIsCover(Boolean isCover) {
        this.isCover = isCover;
    }

    public Boolean getIsFacade() {
        return isFacade;
    }

    public void setIsFacade(Boolean isFacade) {
        this.isFacade = isFacade;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    public String get1200x900p() {
        return _1200x900p;
    }

    public void set1200x900p(String _1200x900p) {
        this._1200x900p = _1200x900p;
    }

    public String get834x624p() {
        return _834x624p;
    }

    public void set834x624p(String _834x624p) {
        this._834x624p = _834x624p;
    }

    public String get360x270cp() {
        return _360x270cp;
    }

    public void set360x270cp(String _360x270cp) {
        this._360x270cp = _360x270cp;
    }

    public String get258x193cp() {
        return _258x193cp;
    }

    public void set258x193cp(String _258x193cp) {
        this._258x193cp = _258x193cp;
    }

    public String get216x162cp() {
        return _216x162cp;
    }

    public void set216x162cp(String _216x162cp) {
        this._216x162cp = _216x162cp;
    }

    public String get144x108cp() {
        return _144x108cp;
    }

    public void set144x108cp(String _144x108cp) {
        this._144x108cp = _144x108cp;
    }

    public String get70x70cp() {
        return _70x70cp;
    }

    public void set70x70cp(String _70x70cp) {
        this._70x70cp = _70x70cp;
    }

}