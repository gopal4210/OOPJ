import java.util.Scanner;

class l1q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date:");
        int date = sc.nextInt();
        int z = 1;
        if (date > 29) {
            System.out.println("Not possible");
            z = 0;
        }
        int rm = date % 7;
        if (z == 1) {
            switch (rm) {
                case 5:
                    System.out.println("Monday");
                    break;
                case 6:
                    System.out.println("Tuesday");
                    break;
                case 0:
                    System.out.println("Wednesday");
                    break;
                case 1:
                    System.out.println("Thursday");
                    break;
                case 2:
                    System.out.println("Friday");
                    break;
                case 3:
                    System.out.println("Saturday");
                    break;
                case 4:
                    System.out.println("Sunday");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
