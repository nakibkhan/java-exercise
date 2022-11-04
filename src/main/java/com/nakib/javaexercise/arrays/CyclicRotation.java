package com.nakib.javaexercise.arrays;

import java.util.Arrays;

class CyclicRotation {
    static int[] processClockwise(int [] num)  {

        int lastNum = num[num.length - 1];
        for(int i = num.length - 2; i >= 0; i--) {
            num[i + 1] = num[i];
        }

        num[0] = lastNum;

        return num;
    }

    static int[] processAntiClockwise(int [] num)  {

        int firstNum = num[0];
        for(int i = 1; i < num.length ; i++) {
            num[i-1] = num[i];
        }

        num[num.length - 1] = firstNum;

        return num;
    }

    public static void main(    String args[])
    {
        int arr[] = new int[] { 3, 5, 21, 42,  94,  35,
                1, 14, 32, 11, 121, 30 };
        System.out.println(Arrays.toString(processAntiClockwise(arr)));
    }
}
