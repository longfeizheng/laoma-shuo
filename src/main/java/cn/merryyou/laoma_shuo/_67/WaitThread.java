package cn.merryyou.laoma_shuo._67;

/**
 * Created by 11 on 2017/5/3.
 */
public class WaitThread extends Thread {

    private volatile boolean fire = false;

    @Override
    public void run() {
        synchronized (this) {
            while (!fire) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("fired");
    }

    public synchronized void fire() {
        this.fire = true;
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();
    }

}
