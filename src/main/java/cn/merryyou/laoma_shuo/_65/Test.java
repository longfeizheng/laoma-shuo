package cn.merryyou.laoma_shuo._65;

/**
 * Created by 11 on 2017/5/3.
 */
public class Test {
    /**
     * 线程的状态
     * NEW: 没有调用start的线程状态为NEW
     TERMINATED: 线程运行结束后状态为TERMINATED
     RUNNABLE: 调用start后线程在执行run方法且没有阻塞时状态为RUNNABLE，不过，RUNNABLE不代表CPU一定在执行该线程的代码，可能正在执行也可能在等待操作系统分配时间片，只是它没有在等待其他条件
     BLOCKED、WAITING、TIMED_WAITING：都表示线程被阻塞了，在等待一些条件，其中的区别我们在后续章节再介绍
     * setPriority（） 设置线程的有优先级
     * isAlive() 当前线程是否或者
     * sleep() 睡眠期间线程会让出CPU
     * join() 让调用join的线程等待该线程结束
     */
    public static void main(String[] args) {

    }
}
