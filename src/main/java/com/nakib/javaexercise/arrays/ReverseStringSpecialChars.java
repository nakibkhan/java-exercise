package com.nakib.javaexercise.arrays;

import java.util.Arrays;

public class ReverseStringSpecialChars {
    public static String process(String initialString) {
        char[] s = initialString.toCharArray();
        char[] temp = new char[s.length];

        int x = 0;
        for (int i = s.length -1; i >= 0; i--)    {
            if(s[i] >= 'a' && s[i] <= 'z'
                    || s[i] >= 'A' && s[i] <= 'Z')  {
                temp[x] = s[i];
                x++;
            }
        }

        System.out.println(Arrays.toString(temp));

        int y = 0;
        for (int i = 0; i < s.length; i++)    {
            if(s[i] >= 'a' && s[i] <= 'z'
                    || s[i] >= 'A' && s[i] <= 'Z')  {
                s[i] = temp[y];
                y++;
            }
        }

        return String.valueOf(s);
    }

    public static void main(String[] args)
    {
        String str = "Ab,c,de!$";
        System.out.println(process(str));
    }
}
