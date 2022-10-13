package com.Bridgelabz.ArrayBasic;

public class SecoundLragestElementOfAnArray {
    public static void main(String[] args) {
        int temp; int size ;
        int arr [] = { 475,879,247,147,369,189,007};
        size= arr.length;;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;

                }
            }
        }
        System.out.println("Secound largest element of an array is " + arr [size-2]);

    }
}

