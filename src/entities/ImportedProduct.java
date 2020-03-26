package entities;

public class ImportedProduct extends Product2{
        
        private Double customsFee;
        
        public ImportedProduct(){
            
        }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        return getName()
                + String.format("%.2f ", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
        
    }  
    
    public Double totalPrice(){
        return getPrice() + customsFee;
    }
    
}
