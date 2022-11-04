package com.nakib.javaexercise.arrays;

public class LowestSumPair {
    static void minAbsSumPair(int[] arrs)   {
        int arraySize = arrs.length;

        if(arraySize < 2)   {
            System.out.println("Invalid input");
            return;
        }

        int min_one = arrs[0];
        int min_two = arrs[1];
        int sum = Math.abs(min_one + min_two);

        for(int i = 1; i < arrs.length - 1; i++)    {
            for(int j = i + 1; j < arrs.length; j++)    {
                int temp_sum = Math.abs(arrs[i] + arrs[j]);

                if(temp_sum < sum)  {
                    sum = temp_sum;
                    min_one = arrs[i];
                    min_two = arrs[j];
                }
            }
        }

        System.out.println("Minimum one " + min_one);
        System.out.println("Minimum two " + min_two);
    }

    public static void main (String[] args)
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsSumPair(arr);
    }
}
