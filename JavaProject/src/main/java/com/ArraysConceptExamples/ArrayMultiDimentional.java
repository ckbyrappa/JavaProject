package com.ArraysConceptExamples;

public class ArrayMultiDimentional {
    public static void main(String args[]) {

       /* int a[][] = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;
        System.out.println(a.length);
        System.out.println((a[0].length));*/
        int a[][]={{100,200},{300,400},{500,600}};
       /* for(int i=0;i<a.length;i++)      //using normal for loop
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }*/
        for(int r[]:a)
        {
           for(int i:r)
           {
               System.out.println(i);
           }
        }
    }
}

