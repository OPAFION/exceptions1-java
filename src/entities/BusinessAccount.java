package entities;

public class BusinessAccount extends Account1{
    
    private Double loanLimit;
    
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
    
    @Override
    public void withDraw(double amount){
        super.withDraw(amount);
        balance -= 2;
    }
}
