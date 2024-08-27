import java.util.Scanner;

class l1q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("O grade");
        } else if (marks >= 80) {
            System.out.println("E garde");
        } else if (marks >= 70) {
            System.out.println("A grade");
        } else if (marks >= 60) {
            System.out.println("B grade");
        } else if (marks >= 50) {
            System.out.println("C grade");
        } else if (marks >= 40) {
            System.out.println("D grade");
        } else if (marks < 40) {
            System.out.println("Fail");
        }
        sc.close();
    }
}
