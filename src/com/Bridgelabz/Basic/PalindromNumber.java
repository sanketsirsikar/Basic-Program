package com.Bridgelabz.Basic;

public class PalindromNumber {
    public static void palindromeNumber(){
        int num =121;
        int temp= num;
        int rev=0;
        int rem;
        while (temp!=0){
            rem=temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if (num==rev)
        {
            System.out.println(num + "Number is Palindrome");
        }else
        {
            System.out.println(num + " number  is not palindrome");
        }
    }
    public static void main(String[] args) {
        palindromeNumber();

    }
}

