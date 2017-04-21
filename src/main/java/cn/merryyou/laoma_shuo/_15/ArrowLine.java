package cn.merryyou.laoma_shuo._15;

import cn.merryyou.laoma_shuo._13.Point;

/**
 * 带箭头直线
 * Created by 11 on 2017/4/21.
 */
public class ArrowLine extends Line {
    private boolean startArrow;
    private boolean endArrow;

    public ArrowLine(Point start, Point end, String color, boolean startArrow, boolean endArrow) {
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }

    @Override
    public void draw(){
        super.draw();
        if(startArrow){
            System.out.println("draw start arrow");
        }
        if(endArrow){
            System.out.println("draw end arrow");
        }
    }
}
