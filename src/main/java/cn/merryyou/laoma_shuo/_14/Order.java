package cn.merryyou.laoma_shuo._14;

import java.util.Date;

/**
 * Created by 11 on 2017/4/20.
 */
public class Order {

    //订单号
    private String id;

    //购买用户
    private User user;

    //购买产品列表及数量
    private OrderItem[] items;

    //下单时间
    private Date createTime;

    //收货人
    private String receiver;

    //收货地址
    private String address;

    //联系电话
    private String phone;

    //订单状态
    private String status;

    public double computeTotalPrice() {
        double totalPrice = 0;
        if (items != null) {
            for (OrderItem item : items) {
                totalPrice += item.computePrice();
            }
        }
        return totalPrice;
    }


}
