package com.nakib.javaexercise.arrays;

import java.util.Arrays;

public class CountPairsSum {

    static int countPairs(int[] numbers, int result) {
        int count = 0;
        for (int i = 0; i< numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == result)   {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String [] args) {
        int[] arr = {1, 5, 7, -1, 5};
        System.out.println(countPairs(arr, 6));
    }
}
