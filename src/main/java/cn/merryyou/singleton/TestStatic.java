package cn.merryyou.singleton;

/**
 * Created by 11 on 2017/7/5.
 */
public class TestStatic {
    static{
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        TestStatic t1 = new TestStatic();
        TestStatic t2 = new TestStatic();
    }
}
