package introduction;

import java.util.*;
import java.io.*;

public class SeriesWithLoops {
    public static String generateSeries(int a, int b, int n) {
        String seriesString = "";
        int result = a;
        int i;

        for (i = 0; i < n; i += 1) {
            result += ((int)(Math.pow(2, i) * b));
            seriesString += (result + " ");
        }
        return seriesString.trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i;

        for (i = 0; i < t; i += 1) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            System.out.println(generateSeries(a, b, n));
        }
    }
}