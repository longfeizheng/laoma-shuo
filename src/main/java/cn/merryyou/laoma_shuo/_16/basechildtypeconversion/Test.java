package cn.merryyou.laoma_shuo._16.basechildtypeconversion;

import cn.merryyou.laoma_shuo._16.renameandstaticbind.Base;
import cn.merryyou.laoma_shuo._16.renameandstaticbind.Child;

/**
 * Created by 11 on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        //Child c = (Child)b就是将变量b的类型强制转换为Child并赋值为c，这是没有问题的，因为b的动态类型就是Child
        Base b = new Child();
        Child c = (Child)b;

        //一个父类的变量，能不能转换为一个子类的变量，取决于这个父类变量的动态类型（即引用的对象类型）是不是这个子类或这个子类的子类
//        Base b1 = new Base();
//        Child c1 = (Child)b1;

        //添加canCase方法 instancesOf
        Base b2 = new Base();
        if(b2.canCase(b2)){
            System.out.println("可以转换成子类型");
        }else{
            System.out.println("父类的动态类型非子类型不能转换成子类型");
        }

    }
}
