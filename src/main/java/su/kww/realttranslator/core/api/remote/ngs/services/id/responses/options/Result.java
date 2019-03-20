package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("old_id")
    @Expose
    private String oldId;
    @SerializedName("old_rubric")
    @Expose
    private String oldRubric;
    @SerializedName("rugion_id")
    @Expose
    private Object rugionId;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("is_batch_load")
    @Expose
    private Boolean isBatchLoad;
    @SerializedName("agency_code")
    @Expose
    private String agencyCode;
    @SerializedName("rubric")
    @Expose
    private String rubric;
    @SerializedName("deal_type")
    @Expose
    private String dealType;
    @SerializedName("creation_date")
    @Expose
    private String creationDate;
    @SerializedName("modification_date")
    @Expose
    private String modificationDate;
    @SerializedName("order_date")
    @Expose
    private String orderDate;
    @SerializedName("system_timestamp")
    @Expose
    private String systemTimestamp;
    @SerializedName("house_id")
    @Expose
    private Object houseId;
    @SerializedName("housing_estate")
    @Expose
    private Object housingEstate;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("is_agency")
    @Expose
    private Boolean isAgency;
    @SerializedName("agency")
    @Expose
    private Object agency;
    @SerializedName("firm")
    @Expose
    private Firm firm;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_special")
    @Expose
    private Boolean isSpecial;
    @SerializedName("is_highlighted")
    @Expose
    private Boolean isHighlighted;
    @SerializedName("is_raised")
    @Expose
    private Boolean isRaised;
    @SerializedName("billing")
    @Expose
    private Billing billing;
    @SerializedName("main_photo")
    @Expose
    private MainPhoto mainPhoto;
    @SerializedName("photos_count")
    @Expose
    private Integer photosCount;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("video_link")
    @Expose
    private Object videoLink;
    @SerializedName("contact_name")
    @Expose
    private String contactName;
    @SerializedName("contact_organization")
    @Expose
    private String contactOrganization;
    @SerializedName("contact_phones")
    @Expose
    private List<Object> contactPhones = null;
    @SerializedName("original_phones")
    @Expose
    private List<Object> originalPhones = null;
    @SerializedName("contact_address")
    @Expose
    private String contactAddress;
    @SerializedName("contact_email")
    @Expose
    private String contactEmail;
    @SerializedName("contact_icq")
    @Expose
    private String contactIcq;
    @SerializedName("contact_url")
    @Expose
    private String contactUrl;
    @SerializedName("params")
    @Expose
    private Params params;
    @SerializedName("hits_count")
    @Expose
    private Integer hitsCount;
    @SerializedName("hits_count_realty")
    @Expose
    private Integer hitsCountRealty;
    @SerializedName("is_validated")
    @Expose
    private Boolean isValidated;
    @SerializedName("rejection_reasons")
    @Expose
    private List<Object> rejectionReasons = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("geo_distance_value")
    @Expose
    private Object geoDistanceValue;
    @SerializedName("allow_actions")
    @Expose
    private Object allowActions;
    @SerializedName("options")
    @Expose
    private Object options;
    @SerializedName("is_similar")
    @Expose
    private Object isSimilar;
    @SerializedName("similars")
    @Expose
    private Object similars;
    @SerializedName("chat")
    @Expose
    private Chat chat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    public String getOldRubric() {
        return oldRubric;
    }

    public void setOldRubric(String oldRubric) {
        this.oldRubric = oldRubric;
    }

    public Object getRugionId() {
        return rugionId;
    }

    public void setRugionId(Object rugionId) {
        this.rugionId = rugionId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getIsBatchLoad() {
        return isBatchLoad;
    }

    public void setIsBatchLoad(Boolean isBatchLoad) {
        this.isBatchLoad = isBatchLoad;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getSystemTimestamp() {
        return systemTimestamp;
    }

    public void setSystemTimestamp(String systemTimestamp) {
        this.systemTimestamp = systemTimestamp;
    }

    public Object getHouseId() {
        return houseId;
    }

    public void setHouseId(Object houseId) {
        this.houseId = houseId;
    }

    public Object getHousingEstate() {
        return housingEstate;
    }

    public void setHousingEstate(Object housingEstate) {
        this.housingEstate = housingEstate;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getIsAgency() {
        return isAgency;
    }

    public void setIsAgency(Boolean isAgency) {
        this.isAgency = isAgency;
    }

    public Object getAgency() {
        return agency;
    }

    public void setAgency(Object agency) {
        this.agency = agency;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public Boolean getIsHighlighted() {
        return isHighlighted;
    }

    public void setIsHighlighted(Boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    public Boolean getIsRaised() {
        return isRaised;
    }

    public void setIsRaised(Boolean isRaised) {
        this.isRaised = isRaised;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public MainPhoto getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(MainPhoto mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public Integer getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(Integer photosCount) {
        this.photosCount = photosCount;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Object getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(Object videoLink) {
        this.videoLink = videoLink;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactOrganization() {
        return contactOrganization;
    }

    public void setContactOrganization(String contactOrganization) {
        this.contactOrganization = contactOrganization;
    }

    public List<Object> getContactPhones() {
        return contactPhones;
    }

    public void setContactPhones(List<Object> contactPhones) {
        this.contactPhones = contactPhones;
    }

    public List<Object> getOriginalPhones() {
        return originalPhones;
    }

    public void setOriginalPhones(List<Object> originalPhones) {
        this.originalPhones = originalPhones;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactIcq() {
        return contactIcq;
    }

    public void setContactIcq(String contactIcq) {
        this.contactIcq = contactIcq;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Integer getHitsCount() {
        return hitsCount;
    }

    public void setHitsCount(Integer hitsCount) {
        this.hitsCount = hitsCount;
    }

    public Integer getHitsCountRealty() {
        return hitsCountRealty;
    }

    public void setHitsCountRealty(Integer hitsCountRealty) {
        this.hitsCountRealty = hitsCountRealty;
    }

    public Boolean getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Boolean isValidated) {
        this.isValidated = isValidated;
    }

    public List<Object> getRejectionReasons() {
        return rejectionReasons;
    }

    public void setRejectionReasons(List<Object> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getGeoDistanceValue() {
        return geoDistanceValue;
    }

    public void setGeoDistanceValue(Object geoDistanceValue) {
        this.geoDistanceValue = geoDistanceValue;
    }

    public Object getAllowActions() {
        return allowActions;
    }

    public void setAllowActions(Object allowActions) {
        this.allowActions = allowActions;
    }

    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }

    public Object getIsSimilar() {
        return isSimilar;
    }

    public void setIsSimilar(Object isSimilar) {
        this.isSimilar = isSimilar;
    }

    public Object getSimilars() {
        return similars;
    }

    public void setSimilars(Object similars) {
        this.similars = similars;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

}