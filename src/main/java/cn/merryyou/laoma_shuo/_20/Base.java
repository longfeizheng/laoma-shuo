package cn.merryyou.laoma_shuo._20;

/**
 * 抽象类和接口是配合而非替代关系，它们经常一起使用，接口声明能力，抽象类提供默认实现，实现全部或部分方法，
 * 一个接口经常有一个对应的抽象类。
 * Created by 11 on 2017/4/26.
 */
public class Base extends AbstractAdder {

    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    @Override
    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }
}
