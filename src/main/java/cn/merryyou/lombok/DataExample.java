package cn.merryyou.lombok;

/**
 * Created by 11 on 2017/6/7.
 */
public class DataExample {
    private final String name;
    private int age;
    private double score;
    private String[] tags;

    public DataExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
