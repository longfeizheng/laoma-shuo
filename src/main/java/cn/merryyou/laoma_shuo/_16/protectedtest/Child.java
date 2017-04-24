package cn.merryyou.laoma_shuo._16.protectedtest;

/**
 * Created by 11 on 2017/4/24.
 */
public class Child extends Base {
    protected void step1() {
        System.out.println("child step" + this.currentStep);
    }

    protected void step2() {
        System.out.println("child step " + this.currentStep);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.action();
        /**
         child step1
         child step 2
         基类定义了表示对外行为的方法action，并定义了可以被子类重写的两个步骤step1和step2，以及被子类查看的变量currentStep，
         子类通过重写protected方法step1和step2来修改对外的行为。

         这种思路和设计在设计模式中被称之为模板方法，action方法就是一个模板方法，它定义了实现的模板，而具体实现则由子类提供。
         模板方法在很多框架中有广泛的应用，这是使用protected的一个常用场景
         */
    }
}
