package cn.merryyou.laoma_shuo._25;

/**
 * 多cache匹配
 * Created by 11 on 2017/4/27.
 */
public class TestCache {
    public static void main(String[] args) {
        try {
            //可能触发异常的代码
        } catch (NumberFormatException e) {
            System.out.println("not valid number");
        } catch (RuntimeException e) {
            System.out.println("runtime exception " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
