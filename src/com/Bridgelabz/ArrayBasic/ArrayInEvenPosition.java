package com.Bridgelabz.ArrayBasic;

public class ArrayInEvenPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++)

            if (arr[i] % 2 == 0) {
                System.out.println("Element of given array present on even postion " + arr[i]);
            }
    }
}

