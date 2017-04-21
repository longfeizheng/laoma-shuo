package cn.merryyou.laoma_shuo._15;

/**
 * 图形
 * Created by 11 on 2017/4/21.
 */
public class Shape {
    private static final String DEFAULT_COLOR = "black";

    private String color;

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("draw shape");
    }
}
