package cn.merryyou.laoma_shuo._14;

import java.util.Date;

/**
 * Created by 11 on 2017/4/20.
 */
public class MyFile {

    //文件名称
    private String name;

    //创建时间
    private Date createtime;

    //文件大小
    private int size;

    //上级目录

    private MyFolder parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyFolder getParent() {
        return parent;
    }

    public void setParent(MyFolder parent) {
        this.parent = parent;
    }
}
