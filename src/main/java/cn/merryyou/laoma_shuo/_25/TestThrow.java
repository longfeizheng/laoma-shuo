package cn.merryyou.laoma_shuo._25;

import cn.merryyou.laoma_shuo._24.AppException;

/**
 * Created by 11 on 2017/4/27.
 */
public class TestThrow {
    public static void main(String[] args) {
        try {
            //可能触发异常的代码
        } catch (NumberFormatException e) {
            System.out.println("not valid number");
//            throw new AppException("输入格式不正确", e);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
