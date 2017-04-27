package cn.merryyou.laoma_shuo._24;

/**
 * RuntimeException(运行时异常)比较特殊，它的名字有点误导，因为其他异常也是运行时产生的，它表示的实际含义是
 * unchecked exception (未受检异常)，相对而言，Exception的其他子类和Exception自身则是checked exception (受检异常)，
 * Error及其子类也是unchecked exception。
 * Created by 11 on 2017/4/27.
 * 异常
 说明
 NullPointerException	空指针异常
 IllegalStateException	非法状态
 ClassCastException	非法强制类型转换
 IllegalArgumentException	参数错误
 NumberFormatException	数字格式错误
 IndexOutOfBoundsException	索引越界
 ArrayIndexOutOfBoundsException	数组索引越界
 StringIndexOutOfBoundsException	字符串索引越界
 */
public class ExceptionTest {
    public static void main(String[] args) {
        String s = null;
        s.indexOf("a");
        System.out.println("end");

//        Exception in thread "main" java.lang.NullPointerException
//        at ExceptionTest.main(ExceptionTest.java:10)
    }
}
