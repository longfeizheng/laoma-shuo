package cn.merryyou.laoma_shuo._23;

/**
 * Created by 11 on 2017/4/26.
 */
public class Test_1 {
    public static void main(String[] args) {
        Size_1 size_1 = Size_1.MEDIUM;
        System.out.println(size_1.getAbbr());

        size_1 = Size_1.fromAbbr("L");
        System.out.println(size_1.getTitle());
    }
}
