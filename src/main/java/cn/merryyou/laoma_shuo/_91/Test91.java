package cn.merryyou.laoma_shuo._91;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 11 on 2017/6/26.
 */
public class Test91 {
    public void test(){
        File f = new File(".");
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.equals("txt")){
                    return true;
                }
                return false;
            }
        });
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.getName().compareTo(f2.getName());
            }
        });

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
    }
}
