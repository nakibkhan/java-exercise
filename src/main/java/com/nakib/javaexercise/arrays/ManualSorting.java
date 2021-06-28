package com.nakib.javaexercise.arrays;

import java.util.Arrays;

public class ManualSorting {
    public static int[] ascending(int[] arr)   {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j]< arr[i])  {
                    int tempValue = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempValue;
                }
            }
        }

        return arr;
    }

    public static int[] descending(int[] arr)   {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j]> arr[i])  {
                    int tempValue = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempValue;
                }
            }
        }

        return arr;
    }

    public static void main(String [] args) {
        int[] arr = {3, 2, 4, 1, -2, 7, 9, 10, 10};
        System.out.println(Arrays.toString(ascending(arr)));
    }
}
