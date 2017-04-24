package cn.merryyou.laoma_shuo._16.constructor;

/**
 * 如果父类没有默认的构造方法，子类必须在构造方法中通过super（ ）调用Base的带参数的构造方法
 * Created by 11 on 2017/4/24.
 */
public class Child extends Base {
    public Child(String member) {
        super(member);
    }
}
