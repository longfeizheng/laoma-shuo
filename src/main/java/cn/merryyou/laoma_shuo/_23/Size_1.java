package cn.merryyou.laoma_shuo._23;

/**
 * Created by 11 on 2017/4/26.
 */
public enum Size_1 {
    SMALL("S", "小号"),
    MEDIUM("M", "中号"),
    LARGE("L", "大号");

    private String abbr;
    private String title;

    private Size_1(String abbr, String title) {
        this.abbr = abbr;
        this.title = title;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getTitle() {
        return title;
    }

    public static Size_1 fromAbbr(String abbr) {
        for (Size_1 size_1 : Size_1.values()) {
            if (size_1.getAbbr().equals(abbr)) {
                return size_1;
            }
        }
        return null;
    }
}
