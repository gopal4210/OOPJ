import java.util.ArrayList;
import java.util.Scanner;

class l2q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int l = 0, r = 0;
        // int ar[][] = new int[3][3];
        // System.out.println("enter the elements of matrix-");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // ar[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(ar[i][j] + " ");

        // }
        // System.out.println(" ");
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // if (i == j) {
        // l = l + ar[i][j];
        // }
        // if (i + j == 2) {
        // r = r + ar[i][j];
        // }
        // }
        // }
        // System.out.println("sum of left diagonal=" + l);
        // System.out.println("sum of right diagonal=" + r);
        // sc.close();

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> in = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                in.add(sc.nextInt());
            }
            a.add(in);
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum1 = sum1 + a.get(i).get(j);
                }
                if ((i + j) == 2) {
                    sum2 = sum2 + a.get(i).get(j);
                }
            }
        }
        System.out.println("Left:" + sum1 + "\nRight:" + sum2);
        sc.close();
    }
}