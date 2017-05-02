package cn.merryyou.laoma_shuo._34;

import java.util.Arrays;
import java.util.Random;

/**
 * 洗牌
 * Created by 11 on 2017/5/2.
 */
public class RandomShuffle {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length; i > 1; i--) {
            swap(arr, i - 1, rnd.nextInt(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
