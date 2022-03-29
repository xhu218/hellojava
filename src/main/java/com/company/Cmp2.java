package com.company;

public class Cmp2 implements IntCompare
{
            public int cmp(int a,int b)
            {
                if(a>b)
                    return -1;
                else if(a<b)
                    return 1;
                else {
                    return 0;
                }
            }
}

