package cn.merryyou.laoma_shuo._34;

import java.util.Random;

/**
 * 随机密码
 * Created by 11 on 2017/5/2.
 */
public class RandomPassword_8 {
    static final String SPECIAL_CARS = "!@#$%^&*_=+-/";

    public static void main(String[] args) {
        String password = randomPassword();
        System.out.println(password);
    }

    private static char netChar(Random rnd) {
        switch (rnd.nextInt(4)) {
            case 0:
                return (char) ('a' + rnd.nextInt(26));
            case 1:
                return (char) ('A' + rnd.nextInt(26));
            case 2:
                return (char) ('0' + rnd.nextInt(10));
            default:
                return SPECIAL_CARS.charAt(rnd.nextInt(SPECIAL_CARS.length()));
        }
    }

    public static String randomPassword() {
        char[] chars = new char[8];
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            chars[i] = netChar(rnd);
        }
        return new String(chars);
    }
}
