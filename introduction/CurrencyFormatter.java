import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    public static String currencyFormatter(double currency) {
        String[] countries = {"US", "India", "China", "France"};
        NumberFormat localPayment;
        String result = "";
        
        for (String country: countries) {
            switch (country) {
                case "US":
                    localPayment = NumberFormat.getCurrencyInstance(Locale.US);
                    result += "US: " + localPayment.format(currency);
                    break;
                case "India":
                    localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    result += "\nIndia: " + localPayment.format(currency);
                    break;
                case "China":
                    localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    result += "\nChina: " + localPayment.format(currency);
                    break;
                case "France":
                    localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    result += "\nFrance: " + localPayment.format(currency);
                    break;
                default:
                    break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double payment = scanner.nextDouble();
        s.close();
        
        // Write your code here.
        System.out.println(currencyFormatter(payment));
    }
}
