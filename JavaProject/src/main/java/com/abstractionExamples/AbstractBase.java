package com.abstractionExamples;

abstract class AbstractBase {
    static void fun() {
        System.out.println("derived fun90 called");
    }
}
 class Derived extends abstractionExamples.AbstractBase
{

    public static void main(String args[])
    {
        AbstractBase d=new Derived();
        d.fun();
    }

}
