package cn.merryyou.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.val;

import java.util.ArrayList;

/**
 * Created by 11 on 2017/6/7.
 */
@Data
public class DataExapleLombok {
    private  String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;

    public static String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }
}
