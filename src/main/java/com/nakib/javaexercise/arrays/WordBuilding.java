package com.nakib.javaexercise.arrays;

import java.io.*;
import java.util.*;

/*
We are building a word processor and we would like to implement a "word-wrap" functionality.

Given a list of words followed by a maximum number of characters in a line, return a collection of strings where each string element represents a line that contains as many words as possible, with the words in each line being concatenated with a single '-' (representing a space, but easier to see for testing). The length of each string must not exceed the maximum character length per line.

Your function should take in the maximum characters per line and return a data structure representing all lines in the indicated max length.

Examples:

words1 = [ "The", "day", "began", "as", "still", "as", "the",
          "night", "abruptly", "lighted", "with", "brilliant",
          "flame" ]

wrapLines(words1, 13) "wrap words1 to line length 13" =>

  [ "The-day-began",
    "as-still-as",
    "the-night",
    "abruptly",
    "lighted-with",
    "brilliant",
    "flame" ]

wrapLines(words1, 20) "wrap words1 to line length 20" =>

  [ "The-day-began-as",
    "still-as-the-night",
    "abruptly-lighted",
    "with-brilliant-flame" ]

words2 = [ "Hello" ]

wrapLines(words2, 5) "wrap words2 to line length 5" =>

  [ "Hello" ]

words3 = [ "Hello", "world" ]

wrapLines(words3, 5) "wrap words3 to line length 5" =>

  [ "Hello",
  "world" ]

words4 = ["Well", "Hello", "world" ]

wrapLines(words4, 5) "wrap words4 to line length 5" =>

  [ "Well",
  "Hello",
  "world" ]

words5 = ["Hello", "HelloWorld", "Hello", "Hello"]

wrapLines(words5, 20) "wrap words 5 to line length 20 =>

  [ "Hello-HelloWorld",
    "Hello-Hello" ]


n = number of words OR total characters



*/

public class WordBuilding {
    public static void main(String[] argv) {

        String[] words1 = {"The","day","began","as","still","as","the","night","abruptly","lighted","with","brilliant","flame"};
        int lineLength1_1 = 13;
        int lineLength1_2 = 20;
        List<String> input = new ArrayList<String>();

        List<String> resultsWords1 = process(words1, lineLength1_1);
        System.out.println(resultsWords1);

//        String[] words2 = {"Hello"};
//        int lineLength2_1 = 5;
//
//        String[] words3 = {"Hello", "world"};
//        int lineLength3_1 = 5;
//
//        String[] words4 = {"Well", "Hello", "world"};
//        int lineLength4_1 = 5;
//
//        String[] words5 = {"Hello", "HelloWorld", "Hello", "Hello"};
//        int lineLength5_1 = 20;

    }

    //   List<String> result = new ArrayList<String>();
    static List<String> process(String[] words, int size)  {
        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< words.length ; i++) {
            String currentResult = sb.toString();

            if(i == 0)  {
                sb.append(words[i]);
            } else {
                sb.append("-").append(words[i]);
            }

            if(sb.toString().length() > size)   {
                result.add(currentResult);
                sb = new StringBuilder(words[i]);
            }
        }

        result.add(sb.toString());
        return result;
    }
}