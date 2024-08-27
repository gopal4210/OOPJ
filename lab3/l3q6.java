import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return length * breadth;
    }

    
    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

public class l3q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Using default constructor:");
        rectangle1.displayDimensions();
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println();

        
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        Rectangle rectangle2 = new Rectangle(length, breadth);
        System.out.println("Using parameterized constructor:");
        rectangle2.displayDimensions();
        System.out.println("Area: " + rectangle2.calculateArea());
        scanner.close();
     
    }
}