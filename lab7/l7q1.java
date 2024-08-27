import java.util.Scanner;

class l7q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index of element to print:");
        int i = sc.nextInt();
        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n" + e);
        }
        sc.close();
    }
}