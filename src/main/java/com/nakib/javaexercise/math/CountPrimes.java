package com.nakib.javaexercise.math;

public class CountPrimes {
    public static int numberPrimes(int num) {
        if(num < 2) {
            return 0;
        }

        if(num == 2)    {
            return 1;
        }

        int result = 1;

        for(int i = 3; i <= num; i++ )  {
            if(isPrime(i))   {
                result++;
            }
        }

        return result;
    }

    static boolean isPrime(int n)   {
        for(int j = 2; j <= Math.sqrt(n); j++)    {
            if(n % j == 0)  {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args)
    {
        System.out.println(numberPrimes(50));
    }
}
