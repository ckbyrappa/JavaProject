package com.controlingStatement.ControlingStatements;

public class continueKeyword1 {
    public static void main(String args[])
    {
        //int i=1;
        for(int i=1;i<=10;i++)
        {
            if(i==3 || i==5 || i==8)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
