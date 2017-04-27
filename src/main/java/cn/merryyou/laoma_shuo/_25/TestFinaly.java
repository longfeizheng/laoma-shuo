package cn.merryyou.laoma_shuo._25;

/**
 * 这个函数的返回值是0，而不是2，实际执行过程是，在执行到try内的return ret;语句前，会先将返回值ret保存在一个临时变量中，
 * 然后才执行finally语句，最后try再返回那个临时变量，finally中对ret的修改不会被返回。
 * Created by 11 on 2017/4/27.
 */
public class TestFinaly {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int ret = 0;
        try {
            return ret;
        } finally {
            ret = 2;
        }
    }
}
