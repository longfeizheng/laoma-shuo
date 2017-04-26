package cn.merryyou.laoma_shuo._23;

/**
 * Created by 11 on 2017/4/26.
 */
public class Test {
    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        //toString() 和name()方法返回面值
        System.out.println(size.toString());
        System.out.println(size.name());

        //equals和==比较
        System.out.println(size == Size.MEDIUM);
        System.out.println(size.equals(Size.MEDIUM));
        System.out.println(size == Size.SMALL);

        //ordinal()表示枚举声明时的顺序
        System.out.println(size.ordinal());

        onChosen(size);

        //values()方法，返回包含数所枚举的数组
        for(Size size1:Size.values()){
            System.out.println(size1);
        }
    }

    //在switch语句内部，枚举值不能带枚举类型前缀
    static void onChosen(Size size){
        switch (size){
            case SMALL:
                System.out.println("small");
                break;
            case LARGE:
                System.out.println("large");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            default:
                System.out.println("none");
        }
    }
}
