package cn.merryyou.laoma_shuo._34;

import java.util.Random;

/**
 * 随机密码
 * Created by 11 on 2017/4/27.
 */
public class RandomPassword {
    public static void main(String[] args) {
        System.out.println((char)('0'+5));
        System.out.println(randomPassword());
    }

    public static String randomPassword() {
        char[] chars = new char[6];
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            chars[i] = (char) ('0' + rnd.nextInt(10));
        }
        return new String(chars);
    }
}
