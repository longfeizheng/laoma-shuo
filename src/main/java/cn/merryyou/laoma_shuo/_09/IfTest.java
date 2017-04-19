package cn.merryyou.laoma_shuo._09;

/**
 * Created by zlf on 2017/4/19.
 */
public class IfTest {
    public static void main(String[] args) {
        int a = 10;
        if (a % 2 == 0) {
            System.out.println("偶数");
        }

        if (a % 2 == 0) System.out.println("偶数");

        //三元云算法
        //判断条件 ? 表达式 1 ： 表达式2
        /**
         if(条件1){
         代码块1
         }else if(条件2){
         代码块2
         }...
         else if(条件n){
         代码块n
         }else{
         代码块n+1
         }

         switch(表达式){
         case 值1：
         代码1; break;
         case 值2:
         代码2; break;
         ...
         case 值n:
         代码n; break;
         default: 代码n+1
         }

         条件执行总体上是比较简单的，单一条件满足时执行某操作使用if，根据一个条件是否满足执行不同分支使用if/else，
         表达复杂的条件使用if/else if/elese，条件赋值使用三元运算符，根据某一个表达式的值不同执行不同的分支使用switch。

         从逻辑上讲，if/else, if/else if/else，三元运算符，switch都可以只用if代替，但使用不同的语法表达更简洁，
         在条件比较多的时候，switch从性能上也更高（马上解释为什么）。


         CPU执行的为跳转指令
         */

    }
}
