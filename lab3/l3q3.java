import java.util.Scanner;

class l3q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[] rollNumbers = new int[n];
        String[] names = new String[n];
        double[] cgpaArray = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("CGPA: ");
            cgpaArray[i] = scanner.nextDouble();
        }

        System.out.println("\nDetails of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("CGPA: " + cgpaArray[i]);
            System.out.println();
        }

        double lowestCGPA = cgpaArray[0];
        int lowestCGPAIndex = 0;

        for (int i = 1; i < n; i++) {
            if (cgpaArray[i] < lowestCGPA) {
                lowestCGPA = cgpaArray[i];
                lowestCGPAIndex = i;
            }
        }

        System.out.println("Student with the lowest CGPA:");
        System.out.println("Name: " + names[lowestCGPAIndex]);
        System.out.println("Roll Number: " + rollNumbers[lowestCGPAIndex]);
        System.out.println("CGPA: " + lowestCGPA);
        scanner.close();
    }
}