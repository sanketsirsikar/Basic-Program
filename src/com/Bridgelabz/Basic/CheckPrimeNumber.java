package com.Bridgelabz.Basic;

public class CheckPrimeNumber {
    public static void main (String[]args){
        int num =7;
        int temp=0;
        for (int i=2; i<=num;i++)
            if (num % 2 == 0)
                temp=temp+1;

        if (temp==0)
        {
            System.out.println(num +"is prime Number ");
        }else
        {
            System.out.println(num+ " Not a prime Number");
        }
    }
}
