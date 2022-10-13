package com.Bridgelabz.Basic;

public class GreatestOfThreeNumber {
    public static void main(String[]args) {
        int num1 = 10;int num2 = 50; int num3 = 20;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "is greter");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greter");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is greter");

        }
    }
}

