package util;
public class CurrencyConverter {
    
    public static final double PRICE_DOLAR = 3.10;
    
    public static double converterDolarMoreIof(double dolar){
        double calculoDaConversao = (dolar * PRICE_DOLAR);
        return  calculoDaConversao + (calculoDaConversao * 6) / 100; 
        
    }
    
}
