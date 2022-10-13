package com.Bridgelabz.ArrayBasic;

public class SmallestElementOfAnArray {
    public static void main(String[] args) {
        int temp; int size;
        int []arr = { 4,5,7,7,6,1,3,};
        size = arr.length;

        for (int i=0; i<size; i++){
            for ( int j= i+1; j<size; j++){

                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }
            }
        }
        System.out.println("Smallest element in array is " + arr[size -1]);

    }

}

