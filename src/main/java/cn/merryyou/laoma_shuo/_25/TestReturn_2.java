package cn.merryyou.laoma_shuo._25;

/**
 * finally中不仅return语句会掩盖异常，如果finally中抛出了异常，则原异常就会被掩盖，
 * Created by 11 on 2017/4/27.
 */
public class TestReturn_2 {
    public static void main(String[] args) {
        test();
    }

    public static int test() {
        try {
            int a = 5 / 0;
        }finally {
            throw new RuntimeException("hello");
        }
    }
}
