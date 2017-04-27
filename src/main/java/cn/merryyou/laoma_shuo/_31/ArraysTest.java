package cn.merryyou.laoma_shuo._31;

import java.util.Arrays;

/**传递比较器Comparator给sort方法，体现了程序设计中一种重要的思维方式，将不变和变化相分离，排序的基本步骤和算法是不变的，
 * 但按什么排序是变化的，sort方法将不变的算法设计为主体逻辑，而将变化的排序方式设计为参数，允许调用者动态指定，这也是一
 * 种常见的设计模式，它有一个名字，叫策略模式，不同的排序方式就是不同的策略。
 * Created by 11 on 2017/4/27.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 4};
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"hello","world"};
        System.out.println(Arrays.toString(strArr));

        System.out.println("---------------------------------------");
        System.out.println(arr);
        System.out.println(strArr);
        System.out.println("---------------------------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String[] Strarr = {"hello","world", "Break","abc"};
//        Arrays.sort(Strarr);
        Arrays.sort(Strarr,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(Strarr));
        System.out.println("---------------------------------------");
        int[] arr1 = {3,5,7,13,21};
        System.out.println(Arrays.binarySearch(arr1, 13));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}
