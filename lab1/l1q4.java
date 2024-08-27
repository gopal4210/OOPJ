import java.util.Scanner;

class l1q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num = sc.nextInt();
        int pal = num;
        int sum = 0, r;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (pal == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
