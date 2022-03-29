package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class Com3Test {

    @Test
    public void cmp() throws Exception {


        for (int x = 0; x < 1; x++) {

            Integer integer = Integer.valueOf("1");
            System.out.println("integer has ocde = " + integer.hashCode());

            Integer integer1 = Integer.valueOf("1");
            System.out.println("integer1 has ocde = " + integer1.hashCode());
            Assert.assertEquals(integer, integer1);

            Integer integer2 = Integer.valueOf("1");
            System.out.println("integer has ocde = " + integer2.hashCode());
            Assert.assertEquals(integer, integer2);

            Integer integer3 = Integer.valueOf("1");
            System.out.println("integer has ocde = " + integer3.hashCode());
            Assert.assertEquals(integer, integer3);


            Integer a1 = 1;
            Integer a2 = 1;

            System.out.println("a1 = " + a1.hashCode());
            System.out.println("a2 = " + a2.hashCode());
            Assert.assertEquals(a1, a2);

            Thread.sleep(1000);
        }


    }

    @Test
    public void Test1() {

        String x = "string";
        String y = "string";
        String z = "string";
        System.out.println(x == y); // true
        System.out.println(x == z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true

        //代码解读：因为 x 和 y 指向的是同一个引用，所以 == 也是 true，而 new String()方法则重写开辟了内存空间，所以 == 结果为 false，而 equals 比较的一直是值，所以结果都为 true


    }

    @Test
    public void Test2() {
        class Cat {
            private String name;

            public Cat(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c1 = new Cat("王磊");
        Cat c2 = new Cat("王磊");
        System.out.println(c1.equals(c2)); // false
        Assert.assertNotEquals(c1,c2);


    }

    @Test
    public void Test3() {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d", str1.hashCode(), str2.hashCode()));
        System.out.println(str1.equals(str2));
    }

    @Test
    public void Test4() {

        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(-1.4));
        System.out.println(Math.round(1.4));
    }
//todo

    @Test
    public void Test5() {
        // StringBuffer reverse
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg");
        System.out.println(stringBuffer.reverse()); // gfedcba
        // StringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdefg");
        System.out.println(stringBuilder.reverse()); // gfedcba


    }

    @Test
    public  void Test6(){

        int [] array = new int [10000];
        Random random = new Random();
        for(int index = 0;index<10000;index++)
        {
            array[index] = random.nextInt(10000);
        }

        int x = isNumInArray(100,array,0,9999);
        System.out.println(x);

    }

    int isNumInArray(int num, int[] array, int start, int end) {
        if(num < array[start] || num > array[end] || start > end){
            return -1;
        }

        int middle = (start + end) / 2; //找到对折点
        if(array[middle] > num) {
            return isNumInArray(num, array, start, middle - 1); //撕掉后一半
        } else if(array[middle] < num){
            return isNumInArray(num,  array,middle + 1, end); //撕掉前一半
        }else {
            return middle;
        }
    }
}
//todo

//https://blog.csdn.net/fangchao2011/article/details/89184058