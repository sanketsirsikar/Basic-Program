package com.Bridgelabz.ArrayBasic;

public class ArrayInAcendingOrder {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 6, 2, 4, 1, 7, 2, 7};
        int size;
        int temp = 0;
        size = arr.length;
        System.out.println("Element of an original array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (arr[i]< arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("Element of an array in ascending order");
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}

