package cn.merryyou.laoma_shuo._16.constructor;

/**
 * Created by 11 on 2017/4/24.
 */
public class Child_1 extends Base_1 {
    private int a = 123;

    public Child_1() {
    }

    public void test() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Child_1 c = new Child_1();
        c.test();

        //0
        //123
        /**
         * 第一次输出为0，第二次为123。第一行为什么是0呢？第一次输出是在new过程中输出的，在new过程中，首先是初始化父类，
         * 父类构造方法调用test()，test被子类重写了，就会调用子类的test()方法，子类方法访问子类实例变量a，而这个时候子
         * 类的实例变量的赋值语句和构造方法还没有执行，所以输出的是其默认值0。
         *
         *
         *
         *
         *
         *在父类构造方法中调用可被子类重写的方法，是一种不好的实践，容易引起混淆，应该只调用private的方法
         *
         *
         *
         */
    }
}
