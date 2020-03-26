package cursojava;

import entities.Account1;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramUpCastingAndDownCasting {

    public static void main(String[] args) {
        
        //POLIMORFISMO
        Account1 x = new Account1(1020, "Alex", 1000.0);
        Account1 y = new SavingsAccount(0.01, 1023, "Maria", 1000.0);
        
        x.withDraw(50.0);
        y.withDraw(50.0);
        
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
        
//        Account1 acc1 = new Account1(1001, "Alex", 1000.0);
//        acc1.withDraw(200.0);
//        System.out.println(acc1.getBalance());
//        
//        Account1 acc2 = new SavingsAccount(0.01, 1002, "Maria", 1000.0);
//        acc2.withDraw(200.0);
//        System.out.println(acc2.getBalance());
//        
//        Account1 acc3 = new BusinessAccount(500.0, 1003, "bob", 1000.0);
//        acc3.withDraw(200.0);
//        System.out.println(acc3.getBalance());
        
        
//        Account1 acc = new Account1(1001, "Alex", 0.0);
//        BusinessAccount bacc  = new BusinessAccount(500.0, 1002, "Maria", 0.0);
//        
//        // UPCASTING
//        
//        Account1 acc1 = bacc;
//        Account1 acc2 = new BusinessAccount(200.0, 1003, "Bob", 0.0);
//        Account1 acc3 = new SavingsAccount(0.01, 1004, "Anna", 0.0);
//        
//        // DOWNCASTING
//        
//        BusinessAccount acc4 = (BusinessAccount)acc2;
//        acc4.loan(100.0);
//        
//        // BusinessAccount acc5 = (BusinessAccount)acc3;
//        if (acc3 instanceof BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount)acc3;
//            acc5.loan(200.00);
//            System.out.println("Loan!");
//        }
//        
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount)acc3;
//            acc5.updateBalance();
//            System.out.println("Update");
//        }
//        
//    }
//
    }
}
