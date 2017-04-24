package cn.merryyou.laoma_shuo._16.renameandstaticbind;

/**
 * Created by 11 on 2017/4/24.
 */
public class Base {
    public static String s = "static_base";
    public String m = "base";

    public static void staticTest() {
        System.out.println("base static" + s);
    }

    public boolean canCase(Base b) {
        return b instanceof Child;
    }
}
