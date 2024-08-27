import java.util.Scanner;

class negativenumberexception extends Exception {
    negativenumberexception() {
        super("Exception occurred:  NegativeNumberException: number should be positive");
    }
}

class l7q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        double n = sc.nextDouble();
        try {
            processinput(n);
        } catch (negativenumberexception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    static void processinput(double n) throws negativenumberexception {
        if (n < 0) {
            throw new negativenumberexception();
        }
    }
}