package cursojava;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account;
        
        System.out.print("Enter account number: ");
        int number = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        char response = scan.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } 
        else{
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account date: ");
        System.out.println(account);
         
        System.out.println();
        System.out.print("Enter a deposit valeu: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a withdraw valeu: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}