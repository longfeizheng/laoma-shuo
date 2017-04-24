package cn.merryyou.laoma_shuo._16.protectedtest;

/**
 * Created by 11 on 2017/4/24.
 */
public class Base {
    protected int currentStep;

    protected void step1(){

    }

    protected void step2(){

    }

    public void action(){
        this.currentStep = 1;
        step1();
        this.currentStep = 2;
        step2();
    }
}
