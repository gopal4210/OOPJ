import java.util.Scanner;

class l1q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String name =sc.nextLine();
        System.out.println("Enter Roll No.:");
        int roll=sc.nextInt();
        System.out.println("Enter section:");
        String sec=sc.next();
        System.out.println("Enter branch:");
        String bran=sc.next();
        System.out.println("Printing details");
        System.out.println("Name:"+name);
        System.out.println("Roll No.:"+roll);
        System.out.println("Sec:"+sec);
        System.out.println("Branch:"+bran);
        sc.close();
    }
}
