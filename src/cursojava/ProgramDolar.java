package cursojava;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramDolar {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("What is the dollar price ? %.2f%n", CurrencyConverter.PRICE_DOLAR);
        System.out.printf("How many dollars will be bought ? ");
        double dolar = sc.nextDouble();
        System.out.printf("Amount to be paid is real = %.2f%n", CurrencyConverter.converterDolarMoreIof(dolar));
        
        sc.close();
    }
    
}
