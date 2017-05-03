package cn.merryyou.laoma_shuo._67;

/**
 * Created by 11 on 2017/5/3.
 */
public class Test {
    public static void main(String[] args) {
        MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);
        new Producet(queue).start();
        new Consumer(queue).start();
    }
}
