package lab5;

import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class HEA implements Manager {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    int Did;
    String Dname;

    public void getDetails() {
        System.out.print("Enter Emp id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter Dept id: ");
        Did = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Dept name: ");
        Dname = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + id + "\nEmployee name - " + name + "\nDepartment id - " + Did
                + "\nDepartment name -" + Dname);
    }
}

class l5q1 {
    public static void main(String[] args) {
        HEA h = new HEA();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}