package cn.merryyou.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class lambda_05_Predicate {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        filter(languages);
    }

    public static void filter(List<String> names) {
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLoing = (n) -> n.length() == 4;

        names.stream().filter(startsWithJ.and(fourLetterLoing)).forEach((n) -> System.out.println("\nName, which starts with 'J' and four letter long is : " + n));
    }
}
