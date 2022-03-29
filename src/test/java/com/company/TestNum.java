package com.company;

import org.junit.Test;

import java.util.Scanner;

public class TestNum {


   @Test
   public  void Test1()
   {
       twoNum();
   }

    //利用三种方法计算两个数的最大公约数和最小公倍数
    static void twoNum() {

        int a = 100;
        int b = 200;
        Calculate c1 = new Calculate();             //创建一个Calculate的对象 c1
        c1.divide(a, b);                       //调用divide方法（辗转相除法）计算
        //c1.sub(a, b);                          //调用sub方法（相减法）计算
        //c1.exp(a, b);                          //调用exp方法（穷举法）计算
    }

    //利用穷举法计算三个数的最大公约数和最小公倍数，效率不高
    static void threeNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入需要计算的正整数：");     //从键盘输入两个数a， b
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Calculate c2 = new Calculate();      //创建一个Calculate的对象 c2
        c2.exp(a, b, c);                     //调用exp方法（穷举法）计算
    }


}
