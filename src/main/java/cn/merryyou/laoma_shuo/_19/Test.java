package cn.merryyou.laoma_shuo._19;

import java.security.cert.PolicyNode;
import java.util.Arrays;

/**
 * Created by 11 on 2017/4/25.
 */
public class Test {
    public static void main(String[] args) {
        MyComparable p1 = new Point(2,3);
        MyComparable p2 = new Point(1,2);
        System.out.println(p1.compareTo(p2));


        Point[] points = new Point[]{new Point(2,3),new Point(3,4),new Point(1,2)};

        System.out.println("max:"+CompUtil.max(points));
        CompUtil.sort(points);
        System.out.println("sort:"+ Arrays.toString(points));

        Point p = new Point(2,3);
        if(p instanceof MyComparable){
            System.out.println("comparable");
        }


        Child_1 c = new Child_1();
        c.addAll(new int[]{1, 2, 3});
        System.out.println(c.getSum());
    }
}
