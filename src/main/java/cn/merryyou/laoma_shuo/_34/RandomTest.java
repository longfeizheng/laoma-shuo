package cn.merryyou.laoma_shuo._34;

import java.util.Random;

/**
 * 它生成一个0到1的随机数，类型为double，包括0但不包括1
 * 随机数基于一个种子，种子固定，随机数序列就固定，默认构造方法中，种子是一个真正的随机数。
 * Created by 11 on 2017/4/27.
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Math.random());
        }

        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(100));

        //Random设置种子
        Random rnd1 = new Random(20160824);
        for (int i = 0; i < 5; i++) {
            System.out.print(rnd1.nextInt(100)+" ");
        }
    }
}
