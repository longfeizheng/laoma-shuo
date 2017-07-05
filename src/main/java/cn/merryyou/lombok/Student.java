package cn.merryyou.lombok;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Created by 11 on 2017/6/7.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student {
    String name;
    int sex;
    Integer age;
    String address;
    List<String> books;
}
