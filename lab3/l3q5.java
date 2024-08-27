import java.util.Scanner;

class AreaCalculator {

    public void area(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + circleArea);
    }

    public void area(double base, double height) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);
    }

    public void area(double sideLength, boolean isSquare) {
        double squareArea = sideLength * sideLength;
        System.out.println("Area of the square: " + squareArea);
    }
}

class l3q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                calculator.area(radius);
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scanner.nextDouble();
                calculator.area(base, height);
                break;
            case 3:
                System.out.println("Enter the side length of the square:");
                double sideLength = scanner.nextDouble();
                calculator.area(sideLength, true);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();

    }
}