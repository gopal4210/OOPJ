class l2q2 {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("give 10 numbers in command line");
            return;
        }
        int even = 0, odd = 0;
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even=" + even + "\nOdd=" + odd);
    }
}