package cn.merryyou.laoma_shuo._35;

import java.util.Random;

/**
 * Created by 11 on 2017/5/2.
 */
public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray<Double> arr = new DynamicArray<Double>();
        Random rnd = new Random();
        int size = 1+rnd.nextInt(100);
        for(int i=0; i<size; i++){
            arr.add(Math.random());
        }
        Double d = arr.get(rnd.nextInt(size));
    }
}
