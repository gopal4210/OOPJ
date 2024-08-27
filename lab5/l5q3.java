package lab5;

import java.util.Scanner;

interface staff {
    void earnings(float b);

    void deductions(float b);

    void bonus(float b);
}

class manager implements staff {
    public void earnings(float b) {
        System.out.println("Earnings=" + (b + b * 0.8 + b * 0.15));
    }

    public void deductions(float b) {
        System.out.println("Deduction=" + (b * 0.12));
    }

    public void bonus(float b) {
    }
}

class substaff extends manager {
    public void bonus(float b) {
        System.out.println("Bonus=" + (0.5 * b));
    }
}

class l5q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter basic salary:");
        int b = s.nextInt();

        substaff m = new substaff();
        m.earnings(b);
        m.deductions(b);
        m.bonus(b);

        s.close();
    }
}