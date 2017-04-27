package cn.merryyou.laoma_shuo._25;

import cn.merryyou.laoma_shuo._24.AppException;

import java.sql.SQLException;

/**
 * 在有了异常机制后，程序的正常逻辑与异常逻辑可以相分离，异常情况可以集中进行处理，异常还可以自动向上传递，不再需要每层
 * 方法都进行处理，异常也不再可能被自动忽略，从而，处理异常情况的代码可以大大减少，代码的可读性、可靠性、可维护性也都可以得到提高。

 * Created by 11 on 2017/4/27.
 */
public class TestThrows {
    public static void main(String[] args) {

    }

    public void test() throws AppException, SQLException, NumberFormatException {
    }

    public void tester() throws AppException {
        try {
            test();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
