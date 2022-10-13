package com.Bridgelabz.Day1Practice;

public class SumOfCommandLineArgument {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int sum = A+B;
        System.out.println("sum of A and B is "+ sum);

    }
}
