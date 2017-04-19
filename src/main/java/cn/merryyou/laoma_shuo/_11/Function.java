package cn.merryyou.laoma_shuo._11;

/**
 * 函数
 * Created by zlf on 2017/4/19.
 */
public class Function {
    /**
     * 修饰符 返回值类型  函数名字(参数类型 参数名字, ...) {
     * 操作 ...
     * return 返回值;
     * }
     * <p>
     * 函数的主要组成部分有：
     * 函数名字：名字是不可或缺的，表示函数的功能。
     * 参数：参数有0个到多个，每个参数有参数的数据类型和参数名字组成。
     * 操作：函数的具体操作代码。
     * 返回值：函数可以没有返回值，没有的话返回值类型写成void，有的话在函数代码中必须要使用return语句返回一个值，这个值的类型需要和声明的返回值类型一致。
     * 修饰符：Java中函数有很多修饰符，分别表示不同的目的，在本节我们假定修饰符为public static，且暂不讨论这些修饰符的目的。
     * <p>
     * <p>
     * 函数可以重名，但是参数不能一样，一样是指参数个数相同，每个位置的参数类型也一样
     */
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        System.out.println(sum(2, 3));

        print3Lines();

        int[] arr = {10, 20, 30, 40};
        reset(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        //可变参数函数
        System.out.println(max(0));
        System.out.println(max(0, 2));
        System.out.println(max(0, 2, 4));
        System.out.println(max(0, 2, 4, 5));

        //递归
        System.out.println(factorial(50));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void print3Lines() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public static void reset(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        }
    }

    //可变长度的参数
    public static int max(int min, int... args) {
        int max = min;
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (max < args[i]) {
                    max = args[i];
                }
            }
        }
        return max;
    }

    //递归
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
