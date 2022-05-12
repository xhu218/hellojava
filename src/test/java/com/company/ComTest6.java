package com.company;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class ComTest6 {
    static int N = 20;

    public static int getValue(int i) {

        int result = 0;

        switch (i) {

            case 1:

                result = result + i;

            case 2:

                result = result + i * 2;

            case 3:

                result = result + i * 3;

        }

        return result;

    }

    static void pong() {
        System.out.print("pong");
    }

    @Test
    public void main() {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.start();
        System.out.print("ping");

    }

    @Test
    public void Test1() {
        int a = 2;
        int n = 5;

        int s = 0, t = 0;
        for (int i = 1; i <= n; i++) {

            t += a;
            a = a * 10;

            s += t;
        }

        System.out.println(s);
    }

    @Test
    public void Test2() {
        long sum = 0;
        long fac = 1;

        for (int i = 1; i <= 20; i++) {
            fac = fac * i;
            System.out.println(" " + fac);
            sum += fac;
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + Long.MAX_VALUE);
    }

    @Test
    public void Test3() {

        int index = 0;

        int num1 = 2;
        int num2 = 1;
        float num3 = 1.0f;
        while (index++ <= 3) {
            float num4 = num1 / num2;
            num3 += num4;
            System.out.println(num4 + "=" + num1 + "/" + num2);
            int temp = num1;
            num1 = num1 + num2;
            num2 = temp;

        }
        System.out.println(num3);

    }

    @Test
    public void Test4() {
        double s = 0;

        double h = 100;

        for (int i = 1; i <= 10; i++) {
            s += h;
            h = h / 2;
            s += h;
        }

        System.out.println("经过路程：" + s);
        System.out.println("反弹高度：" + h);

    }

    @Test
    public void Test5() {

    }

    @Test
    public void Test6() {
        System.out.println(getValue(2));

    }

    @Test
    public void Test7() {
        String str1 = "hello";
        String str2 = "he" + "llo";
        System.err.println(str1 == str2);
    }

    @Test
    public void Test8() {
        String str1 = "wfg";
        System.out.println(str1.hashCode());

    }

    @Test
    public void Test9() {
        System.out.println(mySqrt(102));

    }

    public int mySqrt(int x) {
        if (x <= 1)
            return x;

        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return h;
    }

    @Test
    public void Test10() {
        int[] arr = new int[N];
        int x, n, i;
        int f = -1;
        Random r = new Random();                    //随机种子
        for (i = 0; i < N; i++) {
            arr[i] = r.nextInt(100);                    //产生数组
        }

        System.out.print("随机生成的数据序列:\n");
        for (i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");                    //输出序列
        }
        System.out.print("\n\n");

        System.out.print("输入要查找的整数:");
        Scanner input = new Scanner(System.in);
        x = 9; //input.nextInt();                            //输入要查找的数

        for (i = 0; i < N; i++)                            //顺序查找
        {
            if (x == arr[i])                            //找到数据
            {
                f = i;
                break;
            }
        }
        if (f < 0)                                   //输出查找结果
        {
            System.out.println("没找到数据:" + x);
        } else {
            System.out.print("数据:" + x + " 位于数组的第 " + (f + 1) + " 个元素处.\n");
        }
    }






}
