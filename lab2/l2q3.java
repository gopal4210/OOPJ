import java.util.ArrayList;
import java.util.Scanner;

public class l2q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of ast:");
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // System.out.println("Enter numbers to sort:");
        // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = i+1; j < n; j++) {
        // if (a[i] > a[j]) {
        // int temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(a[i]+" ");
        // }
        // sc.close();

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> fi = new ArrayList<Integer>();
        System.out.println("Enter numbers (-1 to stop):");
        int inp;
        while ((inp = sc.nextInt()) != -1) {
            a.add(inp);
        }
        int q = 0;
        System.out.print("ascending order:");
        for (int i = 0; i < a.size(); i++) {
            int w = a.get(i);
            q = i;
            for (int j = 0; j < a.size(); j++) {
                int m = a.get(j);
                if (w > m) {
                    w = m;
                    q = j;
                }
            }
            fi.add(w);
            a.remove(q);
            i--;
        }
        for (int i = 0; i < fi.size(); i++) {
            System.out.print(fi.get(i) + " ");
        }
        sc.close();
    }
}