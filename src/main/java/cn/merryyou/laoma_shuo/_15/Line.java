package cn.merryyou.laoma_shuo._15;

import cn.merryyou.laoma_shuo._13.Point;

/**
 * 直线
 * Created by zlf on 2017/4/21.
 */
public class Line extends Shape {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public void draw() {
        System.out.println("draw line from " + start.toString() + "to " + end.toString() + ",using color:" + super.getColor());
    }

}
