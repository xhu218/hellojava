package com.company;


import java.io.Serializable;

public  class  Student implements Serializable
{
    private static final long serialVersionUID = -5809452578272945389L;
    private  String Name;
    private  int Age;

    public Student(String name, int age) {
        Name = name;
        Age = age;
    }
    public  void printStudent()
    {
        System.out.print(String.format("name:%s,Age:%s",Name,Age));
    }
}
