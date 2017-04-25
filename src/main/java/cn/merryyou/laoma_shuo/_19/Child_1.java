package cn.merryyou.laoma_shuo._19;

/**
 * 组合与接口结合
 * Created by 11 on 2017/4/25.
 */
public class Child_1 implements IAdd {

    private Base base;
    private long sum;

    public Child_1() {
        base = new Base();
    }

    @Override
    public void add(int number) {
        base.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
        base.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}
