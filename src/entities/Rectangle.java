package entities;
public class Rectangle {
    
    public double width;
    public double height;
    
    public double areaTotal(){
        return width * height;
    }
    
    public double perimeter(){
        return 2 * (width + height);
    }
    
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
    
    public String toString(){
        return    String.format("\nAREA = %.2f", areaTotal())
                + String.format("\nPERIMETER = %.2f", perimeter())
                + String.format("\nDIAGONAL = %.2f", diagonal());
    }
}
