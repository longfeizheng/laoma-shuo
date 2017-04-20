package cn.merryyou.laoma_shuo._14;

import cn.merryyou.laoma_shuo._13.Point;

/**
 * 类的组合
 * Created by zlf on 2017/4/20.
 */
public class Line {
    private Point start;
    private Point end;

    public Line() {
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }

    public static void main(String[] args) {
        Point start = new Point(2, 3);
        Point end = new Point(3, 4);

        Line line = new Line(start, end);
        System.out.println(line.length());
    }
}
