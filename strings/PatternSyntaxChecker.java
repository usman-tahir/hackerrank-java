package strings;

import java.util.Scanner;
import java.util.regex;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine()); // The number of test cases
        
        while (t > 0) {
            String pattern = s.nextLine();
            try {
                Pattern.compile(pattern); // Compiles the input pattern
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}