package cursojava;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = scan.nextLine();
        System.out.print("Gross salay: ");
        employee.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();
        
        System.out.println();
        System.out.println(employee);
        
        System.out.println();
        System.out.print("Which percentage to increase salary ? ");
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);
        
        System.out.println();
        System.out.println("Updated data: " + employee);
        
        scan.close();
    }
    
}
