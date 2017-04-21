package cn.merryyou.laoma_shuo._13;

/**
 * Created by zlf on 2017/4/20.
 */
public class Point {
    public int x;
    public int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distabce() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2)
                + Math.pow(y - p.getY(), 2));
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.x = 2;
        p.y = 3;
        System.out.println(p.distabce());

        p.setX(2);
        p.setY(3);
        System.out.println(p.distabce());
    }
}
