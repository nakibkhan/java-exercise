package com.nakib.javaexercise.arrays;

public class CheckPalindrome {
    public static boolean isPalindrome(String word) {
        char[] wordArray = word.toCharArray();

        for(int i = 0; i < wordArray.length / 2; i++ )  {
            if(wordArray[i] != wordArray[wordArray.length -1 - i]) return false;
        }

        return true;
    }

    public static void main(String [] args) {
        System.out.println(isPalindrome("glenelg"));
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("wasitacaroracatisaw"));
    }
}
