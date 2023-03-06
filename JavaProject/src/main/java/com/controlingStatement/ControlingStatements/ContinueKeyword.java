package com.controlingStatement.ControlingStatements;

public class ContinueKeyword {
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            if(i==5)  //it will skip the number 5
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
