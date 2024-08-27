class l7q5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument();
            } else {
                int y = 0;
                for (String a : args) {
                    int z = Integer.parseInt(a);
                    y = y + z * z;
                }
                System.out.println("Sum of square=" + y);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}

class CheckArgument extends Exception {
    CheckArgument() {
        super("Exception occurred - CheckArgument");
    }
}