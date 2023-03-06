package com.ArraysConceptExamples;

public class ArraySingDimentional {
    public static void main(String args[]){
        //int a[]=new int[5]; // initialization of array with fixed size
       // a[0]=100;
        //a[1]=200;
       // a[2]=300;
       // a[3]=400;
      //  a[4]=500;
        //System.out.println(a[2]);
       // System.out.println(a.length); //find length of an array
        int a[]={100,200,300,400,500};  //initialization of array without fixed size and its a dynamic array


       // for(int i=0;i<a.length;i++)     //read the values from an array using normal for loop
       // {
        //    System.out.println(a[i]);
       // }

        for(int i:a)                    // read the values from array using advanced for loop
        {
            System.out.println((i));
        }
    }
}
