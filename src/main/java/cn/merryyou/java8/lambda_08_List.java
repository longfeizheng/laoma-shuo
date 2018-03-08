package cn.merryyou.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class lambda_08_List {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.", "Canada");
        String collect = strList.stream().map(x -> x.toLowerCase()).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
