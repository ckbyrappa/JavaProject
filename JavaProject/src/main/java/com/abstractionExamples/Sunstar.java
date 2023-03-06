package com.abstractionExamples;

abstract class Sunstar {
    abstract void printInfo();
}
class Employee extends abstractionExamples.Sunstar
{
     void printInfo()
    {
        String name="chaithanya";
        int age=26;

      System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.printInfo();
    }
}
