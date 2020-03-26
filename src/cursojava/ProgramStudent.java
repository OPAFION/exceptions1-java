package cursojava;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Student student = new Student();
        
        student.name = scan.nextLine();
        student.noteFirstQuarter = scan.nextDouble();
        student.noteSecondQuarter = scan.nextDouble();
        student.noteThirdQuarter = scan.nextDouble();
        
        System.out.printf("FINAL GRADE = %.2f%n", student.noteFinal());
        student.passOurFailed();
        
        scan.close();
        
    }
    
}
