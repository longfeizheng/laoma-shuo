package cn.merryyou.laoma_shuo._15;

import cn.merryyou.laoma_shuo._13.Point;

/**
 * Created by 11 on 2017/4/21.
 */
public class ShapeManager {
    private static final int MAX_NUM = 100;

    private Shape[] shapes = new Shape[MAX_NUM];

    private int shapeNum = 0;

    public void addShape(Shape shape) {
        if (shapeNum < MAX_NUM) {
            shapes[shapeNum++] = shape;
        }
    }

    public void draw() {
        for (int i = 0; i < shapeNum; i++) {
            shapes[i].draw();
        }
    }

    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(new Point(4, 4), 3));
        manager.addShape(new Line(new Point(2, 3), new Point(3, 4), "green"));
        manager.addShape(new ArrowLine(new Point(1, 2), new Point(5, 5), "black", false, true));
        manager.draw();
    }
    /**
     * 需要说明的是，在addShape方法中，参数Shape shape，声明的类型是Shape，而实际的类型则分别是Circle，Line和ArrowLine。
     * 子类对象赋值给父类引用变量，这叫向上转型，转型就是转换类型，向上转型就是转换为父类类型。

     变量shape可以引用任何Shape子类类型的对象，这叫多态，即一种类型的变量，可引用多种实际类型对象。这样，对于变量shape，
     它就有两个类型，类型Shape，我们称之为shape的静态类型，类型Circle/Line/ArrowLine，我们称之为shape的动态类型。
     在ShapeManager的draw方法中，shapes[i].draw()调用的是其对应动态类型的draw方法，这称之为方法的动态绑定。
     */
}
