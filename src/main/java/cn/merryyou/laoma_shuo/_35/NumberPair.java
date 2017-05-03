package cn.merryyou.laoma_shuo._35;

/**
 * Created by 11 on 2017/5/3.
 */
public class NumberPair<U extends Number, V extends Number> extends Pair_1<U, V> {
    public NumberPair(U first, V second) {
        super(first, second);
    }

    public double sum() {
        return getFirst().doubleValue() + getSecond().doubleValue();
    }

    public static void main(String[] args) {
        NumberPair<Integer, Double> pair = new NumberPair<>(10, 12.34);
        double sum = pair.sum();
        System.out.println(sum);
    }

    public static <T extends Comparable> T max(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

}
