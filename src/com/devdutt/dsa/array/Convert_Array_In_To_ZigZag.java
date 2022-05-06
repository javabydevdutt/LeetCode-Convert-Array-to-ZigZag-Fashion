package com.devdutt.dsa.array;

import java.util.Arrays;

public class Convert_Array_In_To_ZigZag {

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        System.out.println("Input :- " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i = i + 2) {
            if (arr[i] < arr[i - 1])
                swap(arr, i, i - 1);

            if (arr[i] < arr[i + 1])
                swap(arr, i, i + 1);
        }
        System.out.print("Output :-[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }//for
        System.out.println("]");
    }//main

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
