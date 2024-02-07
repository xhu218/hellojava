package com.company;

/**
 * 第二次作业
 题目：求两个正整数的最大公约数和最小公倍数。
 基本要求：1.程序风格良好(使用自定义注释模板)，两种以上算法解决最大公约数问题，提供友好的输入输出。
 提高要求：1.三种以上算法解决两个正整数最大公约数问题。
 2.求3个正整数的最大公约数和最小公倍数。
 三种方法：相减法；  穷举法；  辗转相除法
 利用穷举法计算三个数的最小公倍数和最大公约数
 */

public class Comp5Test{
    private int num1;   //需要求解的第一个数据
    private int num2;   //需要求解的第二个数据

    //构造方法
    public Comp5Test() {}

    //相减法计算两个数的最大公约数和最小公倍数
    void sub(int num1, int num2) {
        int x, y;  //用于保存num1,num2初始数据
        x = num1;
        y = num2;
        while(num1 != num2) {           //循环条件为两数不相等
            if(num1 > num2)             //如果第一个数大于第二个数
                num1 = num1 - num2;     //两数相减
            else
                num2 = num2 - num1;
        }
        System.out.println("---------------------------------");
        System.out.println("利用相减法计算所得的最大公约数为:"+ num1);     //最大公约数
        System.out.println("利用相减法计算所得的最小公倍数为:"+ x*y/num1);    //最小公倍数
        System.out.println("---------------------------------");
    }



    //穷举法求解两个数的最大公约数和最小公倍数
    void exp(int num1, int num2) {
        int  x, y, i;
        x = num1;
        y = num2;
        int max = 0;    //最大公约数
        for(i=1; i<=num1; i++)
            if(num1%i == 0 && num2%i == 0)
                max = i;
        System.out.println("---------------------------------");
        System.out.println("利用穷举法计算所得最大公约数为:"+max);
        System.out.println("利用穷举法计算所得最小公倍数为："+ x*y/max);	//最小公倍数
        System.out.println("---------------------------------");
    }

    //辗转相除法求解两个数的最大公约数和最小公倍数
    void divide(int num1, int num2) {
        int r,x,y;    //r表示两个数的余数
        x = num1;
        y = num2;
        //如果两个数前者<后者，则互换两个数
        if(num1 < num2) {
            r = num1;
            num1 = num2;
            num2 = r;
        }
        while(num2 != 0) {   //逐次用后一个数去除前一个余数
            r = num1;
            num1 = num2;
            num2 = r%num2;
            System.out.println("num2 = " + num2 + "r = " + r);
        }
        System.out.println("---------------------------------");
        System.out.println("利用辗转相除法计算所得的最大公约数为:"+num1);
        System.out.println("利用辗转相除法计算所得的最小公倍数为:"+ x*y/num1);
        System.out.println("---------------------------------");
    }

    //方法的重载
    //利用穷举法计算三个数的最大公约数和最小公倍数
    void exp(int num1, int num2,int num3) {
        int max, min;
        int i, j;             //保存最终的最大公约数和最小公倍数
        if(num1 < num2) {
            min = num1;
            max = num2;
        }
        else {
            min = num2;
            max = num1;
        }
        if(min > num3) {
            min = num3;           //计算三个数中的最小数
        }
        if(max < num3) {          //求三个数中的最大数
            max = num3;
        }
        for(i=min; i<=min; i--) {
            if(num1%i==0 && num2%i==0 && num3%i==0) {      //当三个数同时被i整除，此时i为三个数对的最大公约数
                break;
            }
        }
        for(j=max;;j++) {
            if(j%num1==0 && j%num2==0 && j%num3==0) {      //当j能被三个数同时整除，j为三个数的最小公倍数
                break;
            }
        }
        System.out.println("计算三个数所得的最大公约数为:"+i);
        System.out.println("计算三个数所得的最小公倍数为:"+j);
    }
}



