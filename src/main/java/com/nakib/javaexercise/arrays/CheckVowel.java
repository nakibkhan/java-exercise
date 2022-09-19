package com.nakib.javaexercise.arrays;

public class CheckVowel {

    public static boolean containsVowel(String words)  {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        char[] wordsArray = words.toLowerCase().toCharArray();

        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == wordsArray[i]) return true;
            }
        }

        return false;

    }

    public static void main(String [] args) {
        System.out.println(containsVowel("apple"));
        System.out.println(containsVowel("ggggggg"));
        System.out.println(containsVowel("psst"));
        System.out.println(containsVowel("gogogo"));
        System.out.println(containsVowel("!"));
    }
}
