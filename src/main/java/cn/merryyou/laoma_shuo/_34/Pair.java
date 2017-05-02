package cn.merryyou.laoma_shuo._34;

/**
 * 带权重的随机选择
 * Created by 11 on 2017/5/2.
 */
public class Pair {
    Object item;
    int weight;

    public Pair(Object item, int weight) {
        this.item = item;
        this.weight = weight;
    }

    public Object getItem() {
        return item;
    }

    public int getWeight() {
        return weight;
    }
}
