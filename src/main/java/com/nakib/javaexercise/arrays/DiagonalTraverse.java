package com.nakib.javaexercise.arrays;

import java.util.Arrays;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[mat.length * mat[0].length];

        int i = 0;
        int j = 0;

        result[0] = mat[i][j];

        boolean goRight = true;

        for(int x = 1; x < result.length; x++)   {
            if(goRight) {
                i--;
                j++;
            } else {
                i++;
                j--;
            }


            if( j == mat[0].length)   {
                j--;
                i+=2;
                goRight = !goRight;
            } else if ( i == mat.length )   {
                i--;
                j+=2;
                goRight = !goRight;
            } else if (i < 0)   {
                i = 0;
                goRight = !goRight;
            } else if (j < 0)   {
                j = 0;
                goRight = !goRight;
            }

            result[x] = mat[i][j];
        }

        return result;

    }

    public static void main(String[] args)
    {
        int[][] mat = new int[][] {{1,2},{3,4}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
}
