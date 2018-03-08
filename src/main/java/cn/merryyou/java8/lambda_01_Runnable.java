package cn.merryyou.java8;

/**
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class lambda_01_Runnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8");
            }
        }).start();

        //Java 8 way
        new Thread(() -> System.out.println("in Java8!")).start();
    }
}
