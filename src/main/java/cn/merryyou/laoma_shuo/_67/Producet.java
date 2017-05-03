package cn.merryyou.laoma_shuo._67;

import cn.merryyou.laoma_shuo._14.Product;

/**
 * Created by 11 on 2017/5/3.
 */
public class Producet extends Thread {
    MyBlockingQueue<String> queue;

    public Producet(MyBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        int num = 0;
        try{
            while (true){
                String task = String.valueOf(num);
                queue.put(task);
                System.out.println("producet task :"+task);
                num++;
                Thread.sleep((int)Math.random()*100);
            }
        }catch (Exception e){

        }
    }
}
