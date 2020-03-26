package cursojava;

import entities.EmployeeList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramList {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<EmployeeList> list = new ArrayList<>();
        
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Emplyoee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new EmployeeList(id, name, salary));
        }
        
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentagem = sc.nextDouble();
            emp.salaryIncrease(percentagem);
        }
        
        System.out.println();
        System.out.println("List of employees: ");
        for(EmployeeList obj: list){
            System.out.println(obj);
        }
        
        sc.close();
    }
    
}
