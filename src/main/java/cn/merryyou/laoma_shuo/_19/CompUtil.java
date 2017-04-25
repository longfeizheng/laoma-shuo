package cn.merryyou.laoma_shuo._19;

/**
 * Created by 11 on 2017/4/25.
 */
public class CompUtil {
    public static Object max(MyComparable[] objs) {
        if (objs == null || objs.length == 0) {
            return null;
        }
        MyComparable max = objs[0];
        for (int i = 1; i < objs.length; i++) {
            if (max.compareTo(objs[i]) < 0) {
                max = objs[i];
            }
        }
        return max;
    }

    public static void sort(MyComparable[] objs) {
        for (int i = 0; i < objs.length; i++) {
            for (int j = i + 1; j < objs.length; j++) {
                if (objs[i].compareTo(objs[j]) > 0) {
                    MyComparable temp = objs[i];
                    objs[i] = objs[j];
                    objs[j] = temp;
                }
            }
        }
    }
}
