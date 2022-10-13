package com.Bridgelabz.Day1Practice;

public class StringIsEqualOrNot {
    static void checkStringEqaualOrNot(String s1, String s2){
        if (s1.equals(s2))
        {
            System.out.println("string is equal ");
        }else
        {
            System.out.println("string is not equal");
        }
    }

    public static void main(String[] args) {
        checkStringEqaualOrNot("sanket", "swapnil");
    }
}

