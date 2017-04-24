package cn.merryyou.laoma_shuo._18;

/**
 * Created by 11 on 2017/4/24.
 */
public class Chind_1 {
    private Base base;
    private long sum;

    public Chind_1() {
        base = new Base();
    }

    public void add(int number) {
        base.add(number);
        sum += number;
    }

    public void addAll(int[] numbers) {
        base.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }
}
