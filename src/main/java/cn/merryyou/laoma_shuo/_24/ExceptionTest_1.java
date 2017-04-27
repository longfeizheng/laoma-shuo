package cn.merryyou.laoma_shuo._24;

/**
 * Created by 11 on 2017/4/27.
 */
public class ExceptionTest_1 {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("请输入数字");
            return;
        }
        int num = Integer.parseInt(args[0]);
        System.out.println(num);
    }
}
