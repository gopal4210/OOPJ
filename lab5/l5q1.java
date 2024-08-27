package lab5;

import java.util.Scanner;

abstract class student {
    int roll, reg_no;

    void get_input() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter roll:");
        roll = s.nextInt();
        System.out.print("Enter register number:");
        reg_no = s.nextInt();
        s.close();
    }

    abstract void course();
}

class kiitians extends student {
    void course() {
        System.out.println("Course:- B.Tech. (Computer Science & Engg)");
    }
}

class l5q1 {
    public static void main(String[] args) {
        kiitians k = new kiitians();
        k.get_input();

        System.out.println("\nRoll number: " + k.roll);
        System.out.println("Registration number: " + k.reg_no);
        k.course();
    }
}