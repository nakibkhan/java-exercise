package com.nakib.javaexercise.arrays;

import java.util.Arrays;

class MissingSerialNumber {
    static int process(int[] num) {
        Arrays.sort(num);
        int beginNumber = num[0];

        for (int i = 0; i< num.length; i++)    {
            int expectedNum = beginNumber + i;
            if (num[i] != expectedNum) return expectedNum;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 2, 6, 5};

        System.out.println("Missing Number is : " + process(arr));
    }

}
