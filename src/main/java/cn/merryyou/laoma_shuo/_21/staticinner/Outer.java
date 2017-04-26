package cn.merryyou.laoma_shuo._21.staticinner;

/**
 * 静态内部类
 * Integer类内部有一个私有静态内部类IntegerCache，用于支持整数的自动装箱。
 表示链表的LinkedList类内部有一个私有静态内部类Node，表示链表中的每个节点。
 Character类内部有一个public静态内部类UnicodeBlock，用于表示一个Unicode block。
 * Created by 11 on 2017/4/26.
 */
public class Outer {
    private static int shared = 100;

    public static class StaticInner {
        public void innerMethod() {
            System.out.println("inner:" + shared);
        }
    }

    public void test() {
        StaticInner si = new StaticInner();
        si.innerMethod();
    }

    public static void main(String[] args) {
        Outer.StaticInner si = new Outer.StaticInner();
        si.innerMethod();
    }
}

