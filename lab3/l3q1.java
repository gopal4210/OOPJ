import java.util.Scanner;

class box {
    double length, width, height;

    public box(double l, double b, double h) {
        length = l;
        width = b;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

class l3q1 {
    public static void main(String[] args) {
        double l, b, h;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length:");
        l = s.nextDouble();
        System.out.print("Enter Width:");
        b = s.nextDouble();
        System.out.print("Enter Height:");
        h = s.nextDouble();

        box box = new box(l, b, h);
        System.out.println("Volume=" + box.volume());

        s.close();
    }
}