package strings;

import java.io.*;
import java.util.*;

public class StringReverse {
    public static boolean isPalindrome(String input) {
        int len = input.length();
        int head, tail = len - 1;
        int count = 0;

        for (head = 0; head < len; head += 1) {
            count += (input.charAt(head) == input.charAt(tail--)) ? 1 : 0;
        }
        return count == len;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextInt();

        System.out.println(isPalindrome(A) == true ? "Yes" : "No")
    }
}