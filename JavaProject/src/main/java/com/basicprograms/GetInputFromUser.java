package com.basicprograms;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(STring args[])
    {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("entered string " +name);
        int num=s.nextInt();
        System.out.println("entered integer "+num);
        float f=s.nextFloat();
        System.out.println("entered float " +f);

    }
}
