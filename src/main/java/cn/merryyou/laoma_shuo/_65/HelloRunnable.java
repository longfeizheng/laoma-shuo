package cn.merryyou.laoma_shuo._65;

/**
 * Created by 11 on 2017/5/3.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Thread helloThread = new Thread(new HelloRunnable());
        helloThread.start();
    }
}
