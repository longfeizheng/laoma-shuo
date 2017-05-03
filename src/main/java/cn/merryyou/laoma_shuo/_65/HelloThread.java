package cn.merryyou.laoma_shuo._65;

/**
 * Created by 11 on 2017/5/3.
 */
public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread name:" + Thread.currentThread().getName());
        System.out.println("hello");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new HelloThread();
        thread.start();
        thread.join();
        System.out.println("mina:"+Thread.currentThread().getName());
//        thread.run();
    }
}
