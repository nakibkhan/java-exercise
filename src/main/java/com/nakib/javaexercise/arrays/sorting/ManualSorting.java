package com.nakib.javaexercise.arrays.sorting;

import java.util.Arrays;

public class ManualSorting {
    public static int[] ascending(int[] arr)   {
        for (int i = 0; i < arr.length; i++)    {
            for (int j = i + 1; j < arr.length; j++)    {
                if(arr[i] > arr[j]) {
                    int temp_int = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp_int;
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

    public static void main(String args[])  {
        int arr[] = new int[] { 3, 5, 2, 4,  9,  3,
                1, 7, 3, 11, 12, 3 };

        System.out.println(Arrays.toString(ascending(arr)));
        System.out.println(Arrays.toString(descending(arr)));
    }
}
