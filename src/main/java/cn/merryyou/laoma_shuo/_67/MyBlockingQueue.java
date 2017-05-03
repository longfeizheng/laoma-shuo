package cn.merryyou.laoma_shuo._67;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by 11 on 2017/5/3.
 */
public class MyBlockingQueue<E> {

    private Queue<E> queue = null;
    private int limit;

    public MyBlockingQueue(int limit){
        this.limit = limit;
        queue = new ArrayDeque<>(limit);
    }

    public synchronized void put(E e) throws InterruptedException{
        while (queue.size() == limit){
            wait();
        }
        queue.add(e);
        notifyAll();
    }

    public synchronized E take() throws InterruptedException{
        while (queue.isEmpty()){
            wait();
        }
        E e = queue.poll();
        notifyAll();
        return e;
    }
}
