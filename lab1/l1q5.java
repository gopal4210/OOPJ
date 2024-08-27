import java.util.Scanner;

class l1q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st name:");
        String n1 = sc.nextLine();
        System.out.println("enter 2nd name:");
        String n2 = sc.next();
        System.out.println("Printing");
        System.out.println(n2 + " " + n1);
        sc.close();
    }
}
