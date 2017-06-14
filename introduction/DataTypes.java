package introduction;

import java.util.*;
import java.io.*;

public class DataTypes {
    public static void printApplicableDataTypes(long input) {
        String result = "";
        if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) {
            result += "* byte\n";
        }
        
        if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
            result += "* short\n";
        }
        
        if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) {
            result += "* int\n";
        }
        
        if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE) {
            result += "* long";
        }
        System.out.println(input + " can be fitted in:\n" + result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // Number of iterations
        int i;

        for (i = 0; i < t; i += 1) {
            try {
                long input = s.nextLong();
                printApplicableDataTypes(input);
            } catch (Exception e) {
                System.out.println(s.next() + " can't be fitted anywhere.");
            }
        }
    }
}