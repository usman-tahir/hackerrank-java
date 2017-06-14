package introduction;

import java.util.*;

public class Conditional {
    public static String parseNumber(int n) {
        boolean even = n % 2 == 0;

        if (!(even) || (even && (n >= 6 && n <= 20))) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        System.out.println(parseNumber(i));
    }
}