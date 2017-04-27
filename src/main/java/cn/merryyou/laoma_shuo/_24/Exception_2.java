package cn.merryyou.laoma_shuo._24;

/**
 * Created by 11 on 2017/4/27.
 */
public class Exception_2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("请输入数字");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.err.println("参数" + args[0]
                    + "不是有效的数字，请输入数字");
        }
    }
}
