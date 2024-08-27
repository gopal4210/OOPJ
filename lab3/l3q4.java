class MathOperations {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}

class l3q4 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int result1 = mathOps.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        double result2 = mathOps.subtract(7.5, 3.2);
        System.out.println("Result 2: " + result2);

        int[] numbers = {15, 8, 3};
        int result3 = mathOps.subtract(numbers);
        System.out.println("Result 3: " + result3);
    }
}
