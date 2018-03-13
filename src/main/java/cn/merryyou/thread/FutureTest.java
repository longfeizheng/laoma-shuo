package cn.merryyou.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created on 2018/3/13.
 *
 * @author zlf
 * @since 1.0
 */
public class FutureTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();

        Future<Integer> result = executorService.submit(task);
        executorService.shutdown();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("主线程执行任务！");

        try{
            System.out.println("task运行结果："+result.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕！");

    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("子线程在进行运算！");
            Thread.sleep(3000);
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
