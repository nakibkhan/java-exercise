package com.nakib.javaexercise.arrays;

public class Max2IndexCondition {
    static int process(int[] arr)   {
        int max = arr[1] - arr[0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i] && j - i > max)    {
                    max = j - i;
                }
            }
        }

        return max;
    }

    public static void main(String [] args) {
        int [] arr2 = {6, 5, 4, 3, 2, 1};

        System.out.println(process(arr2));
    }
}
