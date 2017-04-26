package cn.merryyou.laoma_shuo._23;

/**
 * Created by 11 on 2017/4/26.
 */
public enum Size_2 {
    XSHALL(10), SMALL(20), MEDIUM(30), LARGE(40);
    private int id;

    private Size_2(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}
