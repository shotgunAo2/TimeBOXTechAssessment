
package apiObjects.timeAndBox;

import java.util.List;



public class TimeandboxObject {

    private Integer CategoryId;
    private String Name;
    private String Path;
    private Boolean CanListAuctions;
    private Boolean CanListClassifieds;
    private Boolean CanRelist;
    private String LegalNotice;
    private Integer DefaultDuration;
    private List<Integer> AllowedDurations = null;
    private Fees Fees;
    private Integer FreePhotoCount;
    private Integer MaximumPhotoCount;
    private Boolean IsFreeToRelist;
    private List<Promotion> Promotions = null;
    private List<Object> EmbeddedContentOptions = null;
    private Integer MaximumTitleLength;
    private Integer AreaOfBusiness;
    private Integer DefaultRelistDuration;
    private Boolean CanUseCounterOffers;

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.CategoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        this.Path = path;
    }

    public Boolean getCanListAuctions() {
        return CanListAuctions;
    }

    public void setCanListAuctions(Boolean canListAuctions) {
        this.CanListAuctions = canListAuctions;
    }

    public Boolean getCanListClassifieds() {
        return CanListClassifieds;
    }

    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.CanListClassifieds = canListClassifieds;
    }

    public Boolean getCanRelist() {
        return CanRelist;
    }

    public void setCanRelist(Boolean canRelist) {
        this.CanRelist = canRelist;
    }

    public String getLegalNotice() {
        return LegalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.LegalNotice = legalNotice;
    }

    public Integer getDefaultDuration() {
        return DefaultDuration;
    }

    public void setDefaultDuration(Integer defaultDuration) {
        this.DefaultDuration = defaultDuration;
    }

    public List<Integer> getAllowedDurations() {
        return AllowedDurations;
    }

    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.AllowedDurations = allowedDurations;
    }

    public Fees getFees() {
        return Fees;
    }

    public void setFees(Fees fees) {
        this.Fees = fees;
    }

    public Integer getFreePhotoCount() {
        return FreePhotoCount;
    }

    public void setFreePhotoCount(Integer freePhotoCount) {
        this.FreePhotoCount = freePhotoCount;
    }

    public Integer getMaximumPhotoCount() {
        return MaximumPhotoCount;
    }

    public void setMaximumPhotoCount(Integer maximumPhotoCount) {
        this.MaximumPhotoCount = maximumPhotoCount;
    }

    public Boolean getIsFreeToRelist() {
        return IsFreeToRelist;
    }

    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.IsFreeToRelist = isFreeToRelist;
    }

    public List<Promotion> getPromotions() {
        return Promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.Promotions = promotions;
    }

    public List<Object> getEmbeddedContentOptions() {
        return EmbeddedContentOptions;
    }

    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.EmbeddedContentOptions = embeddedContentOptions;
    }

    public Integer getMaximumTitleLength() {
        return MaximumTitleLength;
    }

    public void setMaximumTitleLength(Integer maximumTitleLength) {
        this.MaximumTitleLength = maximumTitleLength;
    }

    public Integer getAreaOfBusiness() {
        return AreaOfBusiness;
    }

    public void setAreaOfBusiness(Integer areaOfBusiness) {
        this.AreaOfBusiness = areaOfBusiness;
    }

    public Integer getDefaultRelistDuration() {
        return DefaultRelistDuration;
    }

    public void setDefaultRelistDuration(Integer defaultRelistDuration) {
        this.DefaultRelistDuration = defaultRelistDuration;
    }

    public Boolean getCanUseCounterOffers() {
        return CanUseCounterOffers;
    }

    public void setCanUseCounterOffers(Boolean canUseCounterOffers) {
        this.CanUseCounterOffers = canUseCounterOffers;
    }

}
