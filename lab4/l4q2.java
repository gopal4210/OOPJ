package lab4;

import java.util.Scanner;

class plate {
    double l, b;

    public plate() {
        l = b = 0;
    }

    public plate(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void display() {
        System.out.println("Length=" + l + "\nBreadth=" + b);
    }
}

class box extends plate {
    double h;

    public box() {
        h = 0;
    }

    public box(double l, double b, double h) {
        super(l, b);
        this.h = h;
    }

    void display() {
        System.out.println("Length=" + super.l + "\nBreadth=" + super.b + "\nheight=" + h);
    }
}

class wood_box extends box {
    double t;

    public wood_box() {
        t = 0;
    }

    public wood_box(double l, double b, double h, double t) {
        super(l, b, h);
        this.t = t;
    }

    void display() {
        System.out.println("Length=" + super.l + "\nBreadth=" + super.b + "\nheight=" + super.h + "\n thick=" + t);
    }
}

class l4q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length:");
        int l = s.nextInt();
        System.out.print("Enter Breadth:");
        int b = s.nextInt();

        plate p = new plate(l, b);
        p.display();

        System.out.print("Enter length:");
        l = s.nextInt();
        System.out.print("Enter Breadth:");
        b = s.nextInt();
        System.out.print("Enter Height:");
        int h = s.nextInt();

        box g = new box(l, b, h);
        g.display();

        System.out.print("Enter length:");
        l = s.nextInt();
        System.out.print("Enter Breadth:");
        b = s.nextInt();
        System.out.print("Enter Height:");
        h = s.nextInt();
        System.out.print("Enter Thick:");
        int t = s.nextInt();

        wood_box d = new wood_box(l, b, h, t);
        d.display();

        s.close();
    }
}