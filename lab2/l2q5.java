import java.util.ArrayList;
import java.util.Scanner;

public class l2q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("Enter numbers (-1 to stop):");
        int inp;
        while ((inp = sc.nextInt()) != -1) {
            a.add(inp);
        }
        int o;
        int n = a.size();
        for (int i = 0; i < n; i++) {
            o = 1;
            for (int j = i + 1; j < n; j++) {
                if (a.get(i) == a.get(j)) {
                    o++;
                    a.remove(j);
                    n--;
                    j--;
                }
            }
            System.out.println("Occurence of " + a.get(i) + " is " + o);
        }
        sc.close();
    }
}