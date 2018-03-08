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
public class lambda_07_Filtering {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "");
        // Create a List with String more than 2 characters
        List<String> filtered = strList.stream().filter(x -> x.length() > 3)
                .collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n",
                strList, filtered);

    }
}
