package com.Bridgelabz.ArrayBasic;

public class ArrayInOddPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Element of an array present on odd position");

        for (int i=0;i<arr.length; i++)
            if (arr[i] %2 !=0)
            {
                System.out.println(arr[i]);
            }

    }
}
