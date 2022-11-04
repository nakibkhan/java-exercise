package com.nakib.javaexercise.arrays;

import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] arr, int begin, int end) {
        if(begin < end) {
            int pivotpoint = getPivot(arr, begin, end);

            quickSort(arr, begin, pivotpoint -1);
            quickSort(arr, pivotpoint + 1, end);
        }

        return arr;
    }

    public static int getPivot(int[] arr, int begin, int end)   {
        int pivotValue = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++)   {
            if(arr[j] < pivotValue)    {
                i++;

                int tempVal = arr[i];
                arr[i] = arr[j];
                arr[j] = tempVal;
            }
        }

        int tempVal = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = tempVal;


        return i + 1;
    }

    public static void main(String args[])  {
        int arr[] = {1, 60, -10, 70, -80, 85};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

}
