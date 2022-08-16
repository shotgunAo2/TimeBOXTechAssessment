
package apiObjects.timeandbox;


public class ListingFeeTier {

    private Integer MinimumTierPrice;
    private Integer FixedFee;

    public Integer getMinimumTierPrice() {
        return MinimumTierPrice;
    }

    public void setMinimumTierPrice(Integer minimumTierPrice) {
        this.MinimumTierPrice = minimumTierPrice;
    }

    public Integer getFixedFee() {
        return FixedFee;
    }

    public void setFixedFee(Integer fixedFee) {
        this.FixedFee = fixedFee;
    }

}
