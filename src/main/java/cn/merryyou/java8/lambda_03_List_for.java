package cn.merryyou.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class lambda_03_List_for {
    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Defaut Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature.toString());
        }

        features.forEach(n -> System.out.println(n));

        features.forEach(System.out::println);
    }
}
