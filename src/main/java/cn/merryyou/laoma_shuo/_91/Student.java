package cn.merryyou.laoma_shuo._91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by 11 on 2017/6/26.
 */
public class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static <E> List<E> filter(List<E> list, Predicate<E> pred) {
        List<E> retList = new ArrayList<>();
        for (E e : list) {
            if (pred.test(e)) {
                retList.add(e);
            }
        }
        return retList;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[] {
                new Student("zhangsan", 89d),
                new Student("lisi", 89d),
                new Student("wangwu", 98d) });

        List<Student> students1 = filter(students, student -> student.getScore() > 10);
        students1.forEach(student -> System.out.println(student.getName()));
    }
}
