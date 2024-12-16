package com.nakib.javaexercise.math;

public class ReverseInteger {

    public static void main(String args[])
    {
        System.out.println(reverse(321));
    }

    public static int reverse(int x)    {
        double result = 0;

        while(x != 0)   {
            int val = x % 10;
            result = result * 10 + val;

            x = x/10;
        }

        return (int)result;
    }
}
