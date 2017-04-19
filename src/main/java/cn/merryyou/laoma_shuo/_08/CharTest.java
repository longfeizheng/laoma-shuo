package cn.merryyou.laoma_shuo._08;

/**
 * Created by zlf on 2017/4/19.
 */
public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        char z = '中';

        char c2 = 'A';
        char c3 = '马';
        char c4 = 39532;
        char c5 = 0x9a6c;
        char c6 = '\u9a6c';

        char c7 = '马';
        System.out.println(Integer.toBinaryString(c7));
        /**
         char的本质，它固定占用两个字节，实际上是一个整数，表示字符的Unicode编号，不在65536编号内的字符一个char表示不了，
         需要用两个char。
         */
    }
}
