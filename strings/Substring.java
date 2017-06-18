package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        int start = s.nextInt();
        int end = s.nextInt();

        System.out.println(S.substring(start, end));
    }
}