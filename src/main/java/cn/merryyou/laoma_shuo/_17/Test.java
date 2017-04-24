package cn.merryyou.laoma_shuo._17;

/**
 * Created by 11 on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("----new Child()");
        Child c = new Child();

        System.out.println("\n----c.action()");
        c.action();

        Base b = c;
        System.out.println("\n----b.action()");
        b.action();

        System.out.println("\n----b.s:" + b.s);
        System.out.println("\n----c.s:" + c.s);
    }
}
