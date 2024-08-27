import java.util.Scanner;

class l7q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("\nA/B=" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("\n" + e);
        } finally {
            System.out.println("finally block executed");
        }
        sc.close();
    }

}