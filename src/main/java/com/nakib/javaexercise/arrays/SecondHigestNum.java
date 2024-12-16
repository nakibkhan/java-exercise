package com.nakib.javaexercise.arrays;

import java.util.Arrays;

class SecondHigestNum {
    static int findSecondHighest(int [] num)  {
        if(num.length < 2)  {
            return -1;
        }

        int highest = 0;
        int secondHighest = 0;

        for (int j : num) {
            if (j > highest) {
                int temp = highest;
                highest = j;
                secondHighest = temp;
            }

            if(j > secondHighest && j < highest )   {
                secondHighest = j;
            }
        }

        return secondHighest;
    }

    public static void main(String args[])
    {
        int arr[] = new int[] { 3, 5, 21, 42, 94, 35,
                1, 14, 32, 11, 121, 122 };
        System.out.println(findSecondHighest(arr));
    }
}
