package cn.merryyou.laoma_shuo._21.anonymousinner;


import cn.merryyou.laoma_shuo._13.Point;

/**
 * Created by 11 on 2017/4/26.
 */
public class Outer {
    public void test(final int x, final int y) {
        Point p = new Point(2,3){
            public double distance(){
                return distance(new Point(x,y));
            }
        };

        System.out.println(p.distabce());
    }
}
