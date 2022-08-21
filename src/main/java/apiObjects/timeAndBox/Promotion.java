
package apiObjects.timeAndBox;

public class Promotion {

    private Integer Id;
    private String Name;
    private String Description;
    private Integer Price;
    private Integer MinimumPhotoCount;
    private Integer OriginalPrice;
    private Boolean Recommended;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        this.Price = price;
    }

    public Integer getMinimumPhotoCount() {
        return MinimumPhotoCount;
    }

    public void setMinimumPhotoCount(Integer minimumPhotoCount) {
        this.MinimumPhotoCount = minimumPhotoCount;
    }

    public Integer getOriginalPrice() {
        return OriginalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.OriginalPrice = originalPrice;
    }

    public Boolean getRecommended() {
        return Recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.Recommended = recommended;
    }

}
