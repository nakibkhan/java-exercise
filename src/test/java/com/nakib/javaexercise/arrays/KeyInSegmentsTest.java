package com.nakib.javaexercise.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KeyInSegmentsTest {

    @Test
    void findxinkindowSize_empty() {
        int [] numberList = new int[] {};
        Assertions.assertFalse(KeyInSegments.findXinkindowSize(numberList, 2, 2));
    }

    @Test
    void findxinkindowSize_first() {
        int [] numberList = new int[] {2, 1};
        Assertions.assertTrue(KeyInSegments.findXinkindowSize(numberList, 2, 2));
    }

    @Test
    void findxinkindowSize_first_key_less_Size() {
        int [] numberList = new int[] {2, 1};
        Assertions.assertTrue(KeyInSegments.findXinkindowSize(numberList, 2, 3));
    }

    @Test
    void findxinkindowSize_multiple_Batch()    {
        int [] numberList = new int[] {2, 1, 3, 2, 8, 9, 2};
        Assertions.assertTrue(KeyInSegments.findXinkindowSize(numberList, 2, 3));
    }

    @Test
    void findxinkindowSize_multiple_Batch_middle_batch_false()    {
        int [] numberList = new int[] {2, 1, 3, 7, 8, 9, 2};
        Assertions.assertFalse(KeyInSegments.findXinkindowSize(numberList, 2, 3));
    }

    @Test
    void findxinkindowSize_multiple_Batch_end_batch_false()    {
        int [] numberList = new int[] {2, 1, 3, 7, 2, 9, 1};
        Assertions.assertFalse(KeyInSegments.findXinkindowSize(numberList, 2, 3));
    }

}