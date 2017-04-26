package cn.merryyou.laoma_shuo._23;

/**
 * switch的缺陷是，定义swich的代码和定义枚举类型的代码可能不在一起，如果新增了枚举值，应该需要同样修改switch代码，
 * 但可能会忘记，而如果使用抽象方法，则不可能忘记，在定义枚举值的同时，编译器会强迫同时定义相关行为代码。所以，
 * 如果行为代码和枚举值是密切相关的，使用以上写法可以更为简洁、安全、容易维护。
 * Created by 11 on 2017/4/26.
 */
public enum Size_3 {
    SMALL {
        @Override
        public void onChosen() {
            System.out.println("small");
        }
    }, MEDIUM {
        @Override
        public void onChosen() {
            System.out.println("medium");
        }
    }, LARGE {
        @Override
        public void onChosen() {
            System.out.println("large");
        }
    };

    public abstract void onChosen();

}
