// package introduction;

import java.util.Scanner;

public class OutputFormatting {
    public static String numericPadding(String input) {
        int paddingRequired = 3 - input.length();
        if (paddingRequired == 0) {
            return input;
        } else {
            int i;
            String frontPadding = "";
            for (i = 0; i < paddingRequired; i += 1) {
                frontPadding += "0";
            }
            return frontPadding + input;
        }
    }

    public static int linePadding(String string) {
        int currentPadding = string.length();
        // Set to 17 to factor in the spaces taken by the last letter of the string,
        // and the first element/"number" of the integer
        return 17 - currentPadding;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bar = "================================", output = "";
        int i;

        System.out.println(bar);
        for (i = 0; i < 3; i += 1) {
            String string = s.next();
            int integer = s.nextInt();
            System.out.printf("%s %" + linePadding(string) + "%s", string, numericPadding("" + integer));
        }  
        System.out.println(bar);       
    }
}