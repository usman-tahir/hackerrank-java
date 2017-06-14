package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;

        while (s.hasNext()) {
            System.out.println(++i + " " + s.nextLine());
        }
    }
}