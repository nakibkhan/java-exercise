package com.nakib.javaexercise.arrays;

import java.util.Arrays;

class RemoveDuplicates {
    static int[] process(int [] num)  {
        int counter = 0;

        int[] accumulator = new int[num.length];

        for (int j : num) {
            if (!hasDuplicates(accumulator, j)) {
                accumulator[counter] = j;
                counter++;
            }
        }

        System.out.println(Arrays.toString(accumulator));
        System.out.println(counter);

        int [] result = new int[counter];
        for(int i = 0; i < counter; i++)  {
            result[i] = accumulator[i];
        }
        return result;
    }

    private static boolean hasDuplicates(int[] accumulator, int num) {
        for(int checkNum: accumulator)  {
            if(checkNum == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        int arr[] = new int[] { 3, 5, 21, 42,  94,  35,
                1, 14, 32, 11, 121, 30 };
        System.out.println(Arrays.toString(process(arr)));
    }
}
