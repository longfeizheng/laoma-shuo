package cn.merryyou.laoma_shuo._35;

/**
 * 泛型
 * Created by 11 on 2017/5/2.
 */
public class PairTest {
    public static void main(String[] args) {
        Pair<Integer> minmax = new Pair<>(1, 100);
        Integer min = minmax.first;
        Integer max = minmax.second;

        System.out.println("first:" + min);
        System.out.println("second:" + max);

        Pair<String> kv = new Pair<String>("name", "老马");
        String name = kv.first;
        String value = kv.second;

        System.out.println("first:" + name);
        System.out.println("second:" + value);
    }
}
