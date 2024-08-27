class l2q1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Enter a numbers");
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Largest is:" + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Largest is:" + n2);
        } else {
            System.out.println("Largest is:" + n3);
        }
    }
}
