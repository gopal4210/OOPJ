package lab4;

import java.util.Scanner;

class l4q1 {

    static void cos(int len, int bre) {
        System.out.println("cost=" + (40 * len * bre));
    }

    static void cos(int len, int bre, int hei) {
        System.out.println("cost=" + (60 * len * bre * hei));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter type of plastic 1 for 2D and 2 for 3D:");
        int t = s.nextInt();
        int l, b, h;
        switch (t) {
            case 1:
                System.out.print("Enter length:");
                l = s.nextInt();
                System.out.print("Enter breadth:");
                b = s.nextInt();
                cos(l, b);
                break;
            case 2:
                System.out.print("Enter length:");
                l = s.nextInt();
                System.out.print("Enter breadth:");
                b = s.nextInt();
                System.out.print("Enter height:");
                h = s.nextInt();
                cos(l, b, h);
                break;
        }
        s.close();
    }
}
