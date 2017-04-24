package cn.merryyou.laoma_shuo._18;

/**
 * Created by 11 on 2017/4/24.
 */
public class Base {
    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }

    public void addAll(int[] numbers) {
        for (int num : numbers) {
            add(num);
        }
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        count = 0;
    }
}
