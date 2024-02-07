package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {


        // SpringApplication.run(Main.class, args);

        //fun1();
        //fun2();
        //SerializePerson();
        test1();
        System.out.println();




    }

    private  static void test1() throws FileNotFoundException, IOException{


        Student person=  new Student("LXX😅wfg", 1);

        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("d:\\java1.bin")));

        oo.writeObject(person);

        System.out.println("Person对象序列化成功！");

        oo.close();

    }

    private static void SerializePerson()throws FileNotFoundException, IOException{
        Student person=  new Student("lxx\uD83D\uDE04wfg", 1);



        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("d:\\java.bin")));

        oo.writeObject(person);

        System.out.println("Person对象序列化成功！");

        oo.close();

    }


    static void fun2()
    {
        int index=0;
        for (int i=2;i<100000000;i++)
        {
            if (st(i))
            {
                System.out.println(i);

                try (FileWriter fileWriter = new FileWriter("d:\\123.txt",true)) {
                    if(index++ % 24 ==0)
                        fileWriter.append(Integer.toString(i)+"\n");
                    else
                        fileWriter.append(Integer.toString(i)+" ");
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
            }
        }
    }
    static boolean st(int n)
    {
        int m = (int) Math.sqrt(n);
        for(int i=2;i<=m;i++)
        {
            if(n%i==0 && i!=n)
                return false;
        }
        return true;
    }



    public static void fun1() {
        int s;

        for (int i = 1; i <= 100000000; i++) {
            if (i % 1000 == 0)
                System.out.println(i + " ");
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
                String content = i + " = " + sb.toString();

                System.out.println(content);
                try (FileWriter fileWriter = new FileWriter("d:\\123.txt")) {
                    fileWriter.append(content);
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }


            }
        }
    }
}

