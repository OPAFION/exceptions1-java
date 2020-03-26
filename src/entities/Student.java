package entities;

public class Student {
    
    public String name;
    public double noteFirstQuarter;
    public double noteSecondQuarter;
    public double noteThirdQuarter;
    public double missingPoints = 60;
    
    public double noteFinal(){
        return noteFirstQuarter + noteSecondQuarter + noteThirdQuarter;
    }
    
    public double passOurFailed(){
        if(noteFinal() >= missingPoints){
            System.out.println("PASS");
            return noteFinal();
        } else {
            System.out.println("FAILED");
            double calc = this.missingPoints - noteFinal();
            System.out.printf("MISSING " + calc + " POINTS");
            return calc;
        }
    }
}
