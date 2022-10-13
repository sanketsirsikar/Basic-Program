package com.Bridgelabz.ArrayBasic;

public class LargestElementInArray {
    public static void main(String[] args) {
        int temp; int size;
        int[] arr = {2, 4, 77, 7, 8, 9, 1, 0};
        size = arr.length;

        for (int i=0; i<size ; i++){
            for (int j = i+1; j<size; j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }
            }
        }
        System.out.println("Largest element in array is " + arr[size-1]);
    }
}


