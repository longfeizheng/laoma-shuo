package cn.merryyou.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class Lambda_06_Map_Reduce {
    public static void main(String[] args) {
        //map
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + 0.12 * cost;
            System.out.println(price);
        }

        costBeforeTax.stream().map((cost) -> cost + 0.12 * cost).forEach(System.out::println);

        //reduce
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + 0.12 * cost;
            total = total + price;
        }
        System.out.println("Total:" + total);

        Double bill = costBeforeTax.stream().map((cost) -> cost + 0.12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total:"+bill);
    }
}
