package com.company;

public  class  Test{
    public  static void insertSort(int []a, IntCompare cmp){
        if(a!=null){
            for(int i=1;i<a.length;i++){
                int temp = a[i],j = i;
                if(cmp.cmp(a[j-1],temp) == 1){
                    while(j>=1 && cmp.cmp(a[j-1],temp)==1){
                        a[j] = a[j-1];
                        j--;
                        print(a);
                    }
                }
                a[j] = temp;
            }
        }
    }

    public  static void print(int []a)
    {
        for(int i =0;i<a.length;i++){
        System.out.print(a[i] + " ");

        }
        System.out.println("");

    }
}