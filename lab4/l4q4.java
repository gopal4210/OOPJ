package lab4;

import java.util.Scanner;

class account {
    long acc_no;
    float balance;

    Scanner s = new Scanner(System.in);

    void input() {

        System.out.print("Enter account number:");
        acc_no = s.nextLong();

        System.out.print("Enter balance:");
        balance = s.nextFloat();
    }

    void disp() {
        System.out.println("Account no.: " + acc_no + "\nBalance: " + balance);
    }
    // s.close();
}

class person extends account {
    String name;
    long adhar;

    // Scanner s = new Scanner(System.in);

    person(int i) {
        System.out.println("\nEnter details of " + (i + 1) + " Person:");
        super.input();
        System.out.print("Enter name :");
        s.nextLine();
        name = s.nextLine();
        System.out.print("Enter Aadhar card number: ");
        adhar = s.nextLong();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name + "\naadhar card number: " + adhar);
    }
}

class l4q4 {
    public static void main(String[] args) {

        person p[] = new person[3];

        for (int i = 0; i < p.length; i++) {
            p[i] = new person(i);
        }
        int i = 0;
        System.out.println("\n\nPrinting Details\n\n");
        for (person o : p) {
            i++;
            System.out.println("person " + i + ":");
            o.disp();
            System.out.println();
        }
    }
}