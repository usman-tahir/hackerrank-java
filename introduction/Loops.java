package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {
    public static String generateMultiplicationTable(int start) {
        int i;
        String output = "";

        for (i = 1; i <= 10; i += 1) {
            output += (start + " x " + i + " = " + (start * i) + "\n");
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(generateMultiplicationTable(n));

    }
}