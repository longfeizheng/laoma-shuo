package cn.merryyou.laoma_shuo._25;

/**
 * 如果在finally中也有return语句呢？try和catch内的return会丢失，实际会返回finally中的返回值。finally中有return不仅会覆
 * 盖try和catch内的返回值，还会掩盖try和catch内的异常，就像异常没有发生一样
 * Created by 11 on 2017/4/27.
 */
public class TestReturn_1 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        } finally {
            return 2;
        }
    }
}
