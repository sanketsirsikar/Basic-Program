package com.Bridgelabz.Basic;

public class AmstrongNumber {
    public static void ArmStrongNum() {
        boolean isArmStrong = true;
        int num=154;
        int temp = num;
        int r;
        int sum = 0;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("its armstrong number");
        } else {
            System.out.println("not arm strong number");
        }
    }

    public static void main(String[] args) {
        ArmStrongNum();
    }
}
