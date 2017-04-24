package cn.merryyou.laoma_shuo._16.visibilityoverring;

/**
 * 重写方法时，一般并不会修改方法的可见性。但我们还是要说明一点，重写时，子类方法不能降低父类方法的可见性，不能降低是指，
 * 父类如果是public，则子类也必须是public，父类如果是protected，子类可以是protected，也可以是public，即子类可以升级父类
 * 方法的可见性但不能降低。
 * Created by 11 on 2017/4/24.
 */
public class Child extends Base {

 /*
    会编译出错
 private void protect(){

    }

    protected void open(){

    }*/


    public void protect() {

    }
}
