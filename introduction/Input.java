package introduction;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Get input from the user
        int i;

        for (i = 0; i < 3; i += 1) {
            int input = s.nextInt();
            System.out.println(input);
        }
    }
}