package cn.merryyou.laoma_shuo._16.renameandstaticbind;

/**
 * Created by 11 on 2017/4/24.
 * 对于private变量和方法，它们只能在类内被访问，访问的也永远是当前类的
 *
 * 但对于public变量和方法，则要看如何访问它，在类内访问的是当前类的，但子类可以通过super.明确指定访问父类的。在类外，
 * 则要看访问变量的静态类型，静态类型是父类，则访问父类的变量和方法，静态类型是子类，则访问的是子类的变量和方法
 */
public class Child extends Base {
    public static String s = "child static";
    public String m = "child";

    public static void staticTest() {
        System.out.println("child static" + s);
    }

    public static void main(String[] args) {
        Child c = new Child();
        Base b = c;

        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();

        System.out.println(c.s);
        System.out.println(c.m);
        c.staticTest();
    }

    /**
     static_base
     base
     base static: static_base
     child_base
     child
     child static: child_base

     当通过b (静态类型Base) 访问时，访问的是Base的变量和方法，当通过c (静态类型Child)访问时，访问的是Child的变量和方法，
     这称之为静态绑定，即访问绑定到变量的静态类型，静态绑定在程序编译阶段即可决定，而动态绑定则要等到程序运行时。实例变量、
     静态变量、静态方法、private方法，都是静态绑定的。
     */

}
