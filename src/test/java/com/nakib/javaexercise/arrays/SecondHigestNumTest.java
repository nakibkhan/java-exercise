package com.nakib.javaexercise.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SecondHigestNumTest {

    @Test
    void findSecondHighest_empty() {
        int arr[] = new int[] {};
        Assertions.assertEquals(-1, SecondHigestNum.findSecondHighest(arr));
    }

    @Test
    void findSecondHighest_simple() {
        int arr[] = new int[] {1,2,3};
        Assertions.assertEquals(2, SecondHigestNum.findSecondHighest(arr));
    }
}