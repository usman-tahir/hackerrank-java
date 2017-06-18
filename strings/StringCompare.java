package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {
    public static ArrayList<String> createSubstrings(String input, int length;) {
        ArrayList<String> substrings = new ArrayList<String>();
        int i, l = input.length();

        for (i = 0; i < (l - length + 1); i += 1) {
            substrings.add(input.substring(i, i + length));
        }
        return substrings;
    }

    public static String getSmallestSubstring(ArrayList<String> substrings) {
        String smallest = substrings.get(0);
        for (String s : substrings) {
            if (s.compareTo(smallest) <= 0) {
                smallest = s;
            }
        }
        return smallest;
    }

    public static String getLargestSubstring(ArrayList<String> substrings) {
        String largest = substrings.get(0);
        for (String s : substrings) {
            if (s.compareTo(largest) > 0) {
                largest = s;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get the string
        String word = s.next();

        // Get the value for creating n-length substrings
        int n = s.nextInt();

        // Create the substrings
        ArrayList<String> substrings = createSubstrings(word, n);
        String output = getSmallestSubstring(substrings) + "\n" + getLargestSubstring(substrings);
        System.out.println(output);
    }
}