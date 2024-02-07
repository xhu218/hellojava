package com.company;

import org.junit.Test;

import java.util.Scanner;

public class TestNum {


    public void main1(String[] args) {

        int sum = 1;
        for (int i = 0; i < 9; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println("第一天共摘" + sum);
    }

    public void main2(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = in.nextInt();
        System.out.println("请输入n个数");
        int n = in.nextInt();
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

        int[] arr = new int[64 * 1024 * 1024];

        long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
        System.out.println("/**开始 " + startMili);
        for (int i = 0; i < arr.length; i++) arr[i] *= 3;
        long endMili = System.currentTimeMillis();//结束时间
        System.out.println("/**结束 s" + endMili);
        System.out.println("/**总耗时为：" + (endMili - startMili) + "毫秒");

        long startMili1 = System.currentTimeMillis();// 当前时间对应的毫秒数
        System.out.println("/**开始 " + startMili1);
        for (int i = 0; i < arr.length; i += 16) arr[i] *= 3;
        long endMili1 = System.currentTimeMillis();//结束时间
        System.out.println("/**结束 s" + endMili1);
        System.out.println("/**总耗时为：" + (endMili1 - startMili1) + "毫秒");


    }

    @Test
    public void Test3() {

        long x = 9988;
        String s;
        System.out.println(s = Long.toString(x));
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public int fun1(int n) {
        if (n == 1) return 1;
        else return fun1(n - 1) * n;
    }

    public int fun2() {
        int n = 5;
        int sum = 1;
        for (int index = 1; index <= 5; index++) {
            sum = sum * index;
        }
        return sum;
    }

    @Test
    public void Test4() {
        System.out.println(fun1(5));
    }

    @Test
    public void Test5() {
        System.out.println(fun2());
    }

    //分子
    public int fun3(int index) {
        if (index == 1)
            return 2;
        if (index == 2)
            return 3;
        else
            return fun3(index - 2) + fun3(index - 1);
    }

    //分母
    public int fun4(int index) {
        if (index == 1)
            return 1;
        if (index == 2)
            return 2;
        else
            return fun4(index - 2) + fun4(index - 1);
    }

    @Test
    public void Test6() {
        //2/1  3/2 5/3  8/5.....

        float sum = 0.0f;
        for (int index = 1; index <= 20; index++) {
            float num1 = 0.0f;
            num1 = Float.parseFloat(Integer.toString(fun3(index)));
            float num2 = 0.0f;
            num2 = Float.parseFloat(Integer.toString(fun4(index)));
            System.out.println(Float.toString(num1) + "/" + Float.toString(num2));
            sum += num1 / num2;
        }

        System.out.println(sum);

    }

    @Test
    public void Test7() {
        float fm = 1.0f;
        float fz = 1.0f;
        float temp;
        float sum = 0f;

        for (int i = 0; i < 20; i++) {
            temp = fm;
            fm = fz;
            fz = fz + temp;
            System.out.println((int) fz + "/" + (int) fm);
            sum += fz / fm;
        }
        System.out.println(sum);
    }

    @Test
    public void Test8() {
        long sum = 0;
        long fac = 1;
        for (int i = 1; i <= 10; i++) {
            fac = fac * i;
            sum += fac;
        }
        System.out.println(sum);
    }

    @Test
    public void Test9() {
        int i = 0;
        int j = 0;

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 3; i >= 1; i--) {
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void Test10() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

    }

    @Test
    public void Test11() {
        for (int i = 100; i <= 999; i++) {
            if (shuixianhua(i) == true) {
                System.out.println(i);
            }
        }

    }

    public boolean shuixianhua(int x) {

        int i = 0, j = 0, k = 0;
        i = x / 100;
        j = (x % 100) / 10;
        k = x % 10;
        if (x == i * i * i + j * j * j + k * k * k) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void Test12() {

        for (int i = 1; i <= 90; i++) {

            if (zhishu(i) == true)
                System.out.println(i);
        }
    }

    public Boolean zhishu(int x) {
        int max = (int) Math.sqrt(x);
        for (int i = 2; i <= max; i++) {
            if (x % i == 0)
                return false;

        }
        return true;

    }

    @Test
    public void Test13() {
        fenjie(12000);
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
        System.exit(0); // 退出程序
    }

    @Test
    public void Test14() {
        Comp5Test test = new Comp5Test();
        test.sub(12, 18);

        test.divide(12, 18);
    }

    @Test
    public void Test15() {

        String str1 = "Hello wfg , wangufui@sobey.com";
        char[] arr1 = str1.toCharArray();
        byte[] arr = str1.getBytes();
        int digital = 0, character = 0, blank = 0, other = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                digital++;
            } else if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                character++;
            } else if (arr[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }
        System.out.println("数字个数：" + digital);
        System.out.println("英文字母个数：" + character);
        System.out.println("空格个数：" + blank);
        System.out.println("其他字符个数：" + other);

    }

    @Test
    public void Test16() {

        int s;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100000000; i++) {
            //System.out.println("$ "+i);
            s = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s = s + j;
                    sb.append(Integer.toString(j) + " ");
                }
            }
            if (s == i) {
                System.out.println(i + " = " + sb.toString());
                result.append(i + " = " + sb.toString());
            }
        }
        System.out.println(result.toString());
        System.out.println();

    }

    @Test
    public void Test17() {

        math mymath = new math();

        for (int i = 100; i <= 999; i++) {

            if (mymath.shuixianhua(i) == true) {

                System.out.println(i);

            }

        }

    }

    @Test
    public void Test18() {
        /*
        int h = 100;
        float sum = 0.0f;
        for(int i=0;i<9;i++){
            sum +=h;
            h=h/2;
        }

        System.out.println(sum);

         */
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
    public void Test19(){
        int count = 0;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                for (int k = 1; k <= 4; k++) {

                    if (i != j && j != k && i != k) {

                        count += 1;

                        System.out.println(i * 100 + j * 10 + k);

                    }

                }

            }

        }

        System.out.println("共" + count + "个三位数");

    }

    @Test
    public void Test20(){

        for(int x = 1 ; x < 100000 ; x ++) {

            double value1 = Math.sqrt(x + 100);

            double value2 = Math.sqrt(x +  168);

            if (value1 * value1 == x && value2 * value2 == x) {

                System.out.println(x+"加上100后是一个完全平方数，加上168又是一个完全平方数");

            }

        }

    }

}

class math {

    public boolean shuixianhua(int x) {

        int i = 0, j = 0, k = 0;

        i = x / 100;

        j = (x % 100) / 10;

        k = x % 10;

        if (x == i * i * i + j * j * j + k * k * k) {

            return true;

        } else {

            return false;

        }

    }


}







