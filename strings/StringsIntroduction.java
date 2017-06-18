package strings;

import java.io.*;
import java.util.*;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();

        // Print out the combined length
        System.out.println(A.length() + B.length());

        // Compare the strings and determine if A comes before B
        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");

        // Capitalize the first letter of both strings and separate them by a space
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}