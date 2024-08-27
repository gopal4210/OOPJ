import java.util.Scanner;

class rectangl {
    double len, wid;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length:");
        len = s.nextDouble();
        System.out.print("Enter Width:");
        wid = s.nextDouble();
        s.close();
    }

    double area, peri;

    void calculate() {
        area = len * wid;
        peri = 2 * (len + wid);
    }

    void display() {
        System.out.println("Area=" + area + "\nPerimeter=" + peri);
    }
}

class l3q2 {
    public static void main(String[] args) {

        rectangl r = new rectangl();
        r.read();
        r.calculate();
        r.display();
    }
}