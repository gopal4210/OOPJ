import java.util.Scanner;
import marketing.sales;

public class l6p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id: ");
        int empId = scanner.nextInt();
        System.out.print("Enter the employee name: ");
        scanner.nextLine();
        String ename = scanner.nextLine();

        System.out.print("Enter the basic salary: ");
        int basicSalary = scanner.nextInt();

        scanner.close();

        sales sal = new sales(empId, ename);
        sal.earning(basicSalary);
    }
}