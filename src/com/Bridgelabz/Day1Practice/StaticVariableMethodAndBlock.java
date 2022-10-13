package com.Bridgelabz.Day1Practice;

public class StaticVariableMethodAndBlock {

    static int a =10;
    static int b ;

    public static void function(int c, int d){
        int sum= c+d;
        System.out.println(sum + " sum");
        System.out.println(a+"a");
        System.out.println(b+"b");

    }
    static {
        System.out.println("static block");
        int b= a+5;
    }

    public static void main(String[] args) {
        System.out.println(" demonstrate static variable ,method and blocks");
        function(20,30);
    }
}



