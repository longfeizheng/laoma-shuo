package cn.merryyou.laoma_shuo._21.functioninner;

/**
 * Created by 11 on 2017/4/26.
 */
public class Outer {
    private int a = 100;

    public void test(final int param) {
        final String str = "hello";
        class Inner {
            public void innerMethod() {
                System.out.println("outer a:" + a);
                System.out.println("param:" + param);
                System.out.println("local val:" + str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
