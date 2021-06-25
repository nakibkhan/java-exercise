package com.nakib.javaexercise.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void process() {
        int[] arr = new int[] {2,1,2};
        int[] result = new int[] {2,1};

        assertArrayEquals(result, RemoveDuplicates.process(arr));
    }

}