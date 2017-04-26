package cn.merryyou.laoma_shuo._21.memberinner;

/**
 * 成员内部类
 * Created by 11 on 2017/4/26.
 */
public class Outer {
    private int a = 100;

    public class Inner {
        public void innerMethod() {
            System.out.println("outer a:" + a);
            Outer.this.action();
        }
    }

    private void action() {
        System.out.println("action");
    }

    public void test() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}
