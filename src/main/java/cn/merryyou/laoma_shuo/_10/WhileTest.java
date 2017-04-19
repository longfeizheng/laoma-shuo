package cn.merryyou.laoma_shuo._10;

import java.util.Scanner;

/**
 * 循环
 * Created by zlf on 2017/4/19.
 */
public class WhileTest {
    public static void main(String[] args) {
        /**
         while(条件语句){
         代码块
         }

         while(条件语句) 代码;

         do{
         代码块;
         }while(条件语句)

         for(初始化语句; 循环条件; 步进操作){
         循环体
         }


         */
        Scanner reader = new Scanner(System.in);
        System.out.println("please input password");
        int num = reader.nextInt();
        int password = 123456;
        while (num != password) {
            System.out.println("please input password");
            num = reader.nextInt();
        }
        System.out.println("correct");
        reader.close();


//        Scanner reader = new Scanner(System.in);
//        int password = 6789;
//        int num = 0;
//        do{
//            System.out.println("please input password");
//            num = reader.nextInt();
//        }while(num!=password);
//        System.out.println("correct");
//        reader.close();

        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                break;
            }
            System.out.println(arr[i]);
        }

        for (int element : arr) {
            System.out.println(element);
        }

//continue
    }
}
