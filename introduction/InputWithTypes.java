package introduction;

import java.util.Scanner;

public class InputWithTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = Integer.parseInt(s.nextLine());
        double d = Double.parseDouble(s.nextLine());
        String st = s.nextLine();

        System.out.println("String: " + st + "\nDouble: " + d + "\nInt: " + i);
    }
}