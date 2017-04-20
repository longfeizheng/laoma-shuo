package cn.merryyou.laoma_shuo._14;

/**
 * Created by 11 on 2017/4/20.
 */
public class Product {
    //唯一ID
    private String id;
    //产品名称
    private String name;
    //产品图片链接
    private String pictureUrl;
    //产品描述
    private String description;
    //产品价格
    private double price;

    public Product() {
    }

    public Product(String id, String name, String pictureUrl, String description, double price) {
        this.id = id;
        this.name = name;
        this.pictureUrl = pictureUrl;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
