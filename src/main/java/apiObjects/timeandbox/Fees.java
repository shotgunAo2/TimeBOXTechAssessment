
package apiObjects.timeandbox;

import java.util.List;



public class Fees {

    private Integer Bundle;
    private Double EndDate;
    private Integer Feature;
    private Integer Gallery;
    private Integer Listing;
    private Double Reserve;
    private Double Subtitle;
    private Double TenDays;
    private List<ListingFeeTier> ListingFeeTiers = null;
    private Double SecondCategory;

    public Integer getBundle() {
        return Bundle;
    }

    public void setBundle(Integer bundle) {
        this.Bundle = bundle;
    }

    public Double getEndDate() {
        return EndDate;
    }

    public void setEndDate(Double endDate) {
        this.EndDate = endDate;
    }

    public Integer getFeature() {
        return Feature;
    }

    public void setFeature(Integer feature) {
        this.Feature = feature;
    }

    public Integer getGallery() {
        return Gallery;
    }

    public void setGallery(Integer gallery) {
        this.Gallery = gallery;
    }

    public Integer getListing() {
        return Listing;
    }

    public void setListing(Integer listing) {
        this.Listing = listing;
    }

    public Double getReserve() {
        return Reserve;
    }

    public void setReserve(Double reserve) {
        this.Reserve = reserve;
    }

    public Double getSubtitle() {
        return Subtitle;
    }

    public void setSubtitle(Double subtitle) {
        this.Subtitle = subtitle;
    }

    public Double getTenDays() {
        return TenDays;
    }

    public void setTenDays(Double tenDays) {
        this.TenDays = tenDays;
    }

    public List<ListingFeeTier> getListingFeeTiers() {
        return ListingFeeTiers;
    }

    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.ListingFeeTiers = listingFeeTiers;
    }

    public Double getSecondCategory() {
        return SecondCategory;
    }

    public void setSecondCategory(Double secondCategory) {
        this.SecondCategory = secondCategory;
    }

}
