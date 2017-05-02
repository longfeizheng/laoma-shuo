package cn.merryyou.laoma_shuo._34;

import java.util.Random;

/**
 * 抢红包算法
 * Created by 11 on 2017/5/2.
 */
public class RandomRedPacket {
    private int leftMoney;
    private int leftNum;
    private Random rnd;

    public RandomRedPacket(int total, int num) {
        this.leftMoney = total;
        this.leftNum = num;
        rnd = new Random();
    }

    public synchronized int nextMoney() {
        if (this.leftNum <= 0) {
            throw new IllegalArgumentException("抢光啦");
        }

        if (leftNum == 1) {
            return this.leftMoney;
        }
        double max = this.leftMoney / this.leftNum * 2d;
        int money = (int) (rnd.nextDouble() * max);
        money = Math.max(1, money);
        this.leftMoney -= money;
        this.leftNum--;

        return money;
    }

    public static void main(String[] args) {
        RandomRedPacket redPacket = new RandomRedPacket(1000, 10);
        for (int i = 0; i < 10; i++) {
            System.out.print(redPacket.nextMoney() + " ");
        }
    }

}
