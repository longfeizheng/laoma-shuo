package cn.merryyou.laoma_shuo._16.overloadingoverrinding;

/**
 * Created by 11 on 2017/4/24.
 */
public class Child extends Base {
    public long sum(long a, long b) {
        System.out.println("child_long_long");
        return a + b;
    }

    public static void main(String[] args) {
        Child c = new Child();
        int a = 2;
        int b = 3;
        c.sum(2, 3);
    }
    /**
     base_int_int

     当有多个重名函数的时候，在决定要调用哪个函数的过程中，首先是按照参数类型进行匹配的，换句话说，寻找在所有重载版本中
     最匹配的，然后才看变量的动态类型，进行动态绑定。
     */
}
