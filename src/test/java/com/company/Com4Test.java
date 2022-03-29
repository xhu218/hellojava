package com.company;

import org.junit.Test;

public class Com4Test {


    public static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;

        } else {
            return f(x - 1) + f(x - 2);
        }

    }

    public static boolean isPrime1(int num) {

        if (num <= 3) {
            return num > 1;
        }
        boolean ispri = true;
        for (int i = 4; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                ispri = false;
                break;
            }
        }
        return ispri;
    }

    public static boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isShuxian(int num) {
        int x1 = num / 100;
        int x2 = (num - x1 * 100) / 10;
        int x3 = num - x1 * 100 - x2 * 10;

        return num == (Math.pow(x1, 3) + Math.pow(x2, 3) + Math.pow(x3, 3));

    }

    @Test
    public void Test1() {


        int x = f(20);
        System.out.println(x);

    }

    @Test
    public void Test2() {

        long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
        System.out.println("/**开始 " + startMili);

        for (int i = 100000; i <= 200000; i++) {
            if (isPrime(i))
                System.out.print(" " + i);
        }
        long endMili = System.currentTimeMillis();//结束时间
        System.out.println("/**结束 s" + endMili);
        System.out.println("/**总耗时为：" + (endMili - startMili) + "毫秒");
    }

    @Test
    public void Test3() {

        System.out.println(isShuxian(153));
    }

    @Test
    public void Test4() {

        fenjie(100);
    }


    public void fenjie(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);

                if (n != i) {
                    System.out.print("*");

                }

                fenjie(n / i);

            }

        }

        //System.exit(0); // 退出程序

    }


}
