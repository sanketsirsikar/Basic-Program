package com.Bridgelabz.Day1Practice;

import java.util.Scanner;

public class LeapyearOrNot {
    public static void LeapYearOrNot(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year %400 ==0 )
        {
            System.out.println(year + "leap year");
        }else if  (year %4 ==0 && year % 100!=0)
        {
            System.out.println( year +"leap year");
        }else
        {
            System.out.println(year + "not leap year");
        }

    }

    public static void main(String[] args) {
        LeapYearOrNot();

    }

}


