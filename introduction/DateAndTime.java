package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateAndTime {
    public static String convertDate(String month, String day, String year) {
        Calendar c = new GregorianCalendar(Locale.US);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        c.set(Calendar.YEAR, Integer.parseInt(year));
        c.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        
        return days[c.get(Calendar.DAY_OF_WEEK) - 1].toUpperCase();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String month = s.next();
        String day = s.next();
        String year = s.next();
        System.out.println(convertDate(month, day, year));
    }
}