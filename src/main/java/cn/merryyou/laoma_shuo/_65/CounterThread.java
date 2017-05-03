package cn.merryyou.laoma_shuo._65;

/**
 * Created by 11 on 2017/5/3.
 */
public class CounterThread extends Thread {
    private static int counter = 0;

    @Override
    public void run() {
        try {
            Thread.sleep((int) Math.random() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

        System.out.println(counter);
    }
}
