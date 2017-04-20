package cn.merryyou.laoma_shuo._14;

import java.util.Date;

/**
 * Created by 11 on 2017/4/20.
 */
public class MyFolder {

    //文件夹名称
    private String name;

    //创建时间
    private Date createTIme;

    //上级文件夹
    private MyFolder parent;

    //包含的文件
    private MyFile[] files;

    //包含的文件夹
    private MyFolder[] subFolders;

    //递归
    public int totalSize() {
        int totalSize = 0;
        if (files != null) {
            for (MyFile file : files) {
                totalSize += file.getSize();
            }
        }
        if (subFolders != null) {
            for (MyFolder folder : subFolders) {
                totalSize += folder.totalSize();
            }
        }

        return totalSize;
    }

    public MyFolder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Date createTIme) {
        this.createTIme = createTIme;
    }

    public MyFolder getParent() {
        return parent;
    }

    public void setParent(MyFolder parent) {
        this.parent = parent;
    }

    public MyFile[] getFiles() {
        return files;
    }

    public void setFiles(MyFile[] files) {
        this.files = files;
    }

    public MyFolder[] getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(MyFolder[] subFolders) {
        this.subFolders = subFolders;
    }
}
