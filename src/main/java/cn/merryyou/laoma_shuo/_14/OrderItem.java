package cn.merryyou.laoma_shuo._14;

/**
 * Created by 11 on 2017/4/20.
 */
public class OrderItem {

    //购买产品
    private Product product;

    //购买数量
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double computePrice() {
        return product.getPrice() * quantity;
    }
}
