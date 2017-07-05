package cn.merryyou.lombok;

/**
 * Created by 11 on 2017/6/7.
 */
public class LombokTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("test");
        System.out.println(student.getName());
        System.out.println(DataExapleLombok.example());

        NonNullLombok nonNullLombok = new NonNullLombok(student);
    }
}
