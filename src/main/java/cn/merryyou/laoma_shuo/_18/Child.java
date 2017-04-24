package cn.merryyou.laoma_shuo._18;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by 11 on 2017/4/24.
 */
public class Child extends Base {

    private long sum;

    @Override
    public void add(int number) {
        sum += number;
        super.add(number);
    }

    @Override
    public void addAll(int[] numbers) {
        super.addAll(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
    }

    public long getSum() {
        return sum;
    }
}
