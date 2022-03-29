package com.company;


public  class  Student
{
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
