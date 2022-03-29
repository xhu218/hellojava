package com.company;

public class Main  {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello wfg");
        Student stu = new Student("wfg",11);
        //stu.printStudent();

        int [] arr1 = {7,3,19,40,4,7,1};
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");

        }
        System.out.println("");

        Test.insertSort(arr1,new Cmp1());

        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");

        }



    }
}

