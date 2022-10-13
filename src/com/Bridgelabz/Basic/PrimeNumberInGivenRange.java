package com.Bridgelabz.Basic;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int lower = 2;
        int higher = 10;

        for (int i = lower; i <= higher; i++)
            if (isPrime(i))
                System.out.println(i);

    }


    public static boolean isPrime(int n) {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i < n ; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}



