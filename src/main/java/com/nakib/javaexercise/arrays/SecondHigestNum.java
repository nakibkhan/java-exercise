package com.nakib.javaexercise.arrays;

import java.util.Arrays;

class SecondHigestNum {
    static int findSecondHighest(int [] num)  {
        if(num.length < 2)  {
            return -1;
        }

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        return num[num.length -2];
    }

    public static void main(String args[])
    {
        int arr[] = new int[] { 3, 5, 21, 42,  94,  35,
                1, 14, 32, 11, 121, 30 };
        System.out.println(findSecondHighest(arr));
    }
}
