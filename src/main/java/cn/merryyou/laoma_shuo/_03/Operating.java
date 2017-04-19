package cn.merryyou.laoma_shuo._03;

/**
 * 运算
 * Created by zlf on 2017/4/19.
 */
public class Operating {
    public static void main(String[] args) {
        /**
         算术运算：主要是日常的加减乘除
         比较运算：主要是日常的大小比较
         逻辑运算：针对布尔值进行运算

         */

        //加减乘除需注意结果的范围
        int a = 2147483647 * 2; //2147483647是int能表示的最大值
        System.out.println(a);//-2
        //正确写法

        long b = 2147483647 * 2l;
        System.out.println(b);//4294967294

        double d = 10 / 4;
        System.out.println(d);//2

        double d1 = 10 / 4.0;
        System.out.println(d1);//2.5

        //小数计算不精确
        float f = 0.1f * 0.1f;
        System.out.println(f);//0.010000001

        double d2 = 0.1*0.1;
        System.out.println(d2);//0.010000000000000002

        //自增，自减运算 i++ ++i i-- --i;

        //比较运算
        //大于(>)，大于等于(>=)，小于(<)，小于等于(<=)，等于(==)，不等于(!=)。

        //逻辑运算

        /**
         与(&)：两个都为true才是true，只要有一个是false就是false
         或(|)：只要有一个为true就是true，都是false才是false
         非(!)：针对一个变量，true会变成false, false会变成true
         异或(^)：两个相同为false, 两个不相同为true
         短路与(&&): 和&类似，不同之处马上解释
         短路或 (||)：与|类似，不同之处马上解释
         */

    }
}
