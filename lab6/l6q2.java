package lab6;

import java.util.Scanner;

public class l6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        String a = sc.nextLine();

        System.out.println("\nAfter changing case:" + a.toUpperCase());

        System.out.print("\nAfter reversing case:");
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }

        System.out.print("\nEnter 2nd string:");
        String b = sc.nextLine();

        System.out.println("\nDifference=" + (-a.charAt(0) + b.charAt(0)) + "\n");

        System.out.print("Enter new string to add to 1st string:");
        String c = sc.nextLine();
        a = a + " " + c;
        System.out.println("After insertion:" + a);

        System.out.print("Enter a string:");
        String d = sc.nextLine();
        System.out.println("\nUppercase:" + d.toUpperCase() + "\nLowercase:" + d.toLowerCase());

        System.out.print("Enter a string:");
        String e = sc.nextLine();
        System.out.print("\nEnter a character:");
        char f = sc.nextLine().charAt(0);
        int pos = e.indexOf(f);
        if (pos == -1) {
            System.out.println("Char not present");
        } else {
            System.out.println("Char is present and Position is :" + (pos + 1));
        }

        System.out.print("enter a string:");
        String g = sc.nextLine();
        int x = 0;
        for (int i = 0; i < (g.length() / 2); i++) {
            if (g.charAt(i) != g.charAt(g.length() - i - 1)) {
                x = 1;
            }
        }
        if (x == 1) {
            System.out.println("Not palindrome");
        } else {
            System.out.println("Palindrome");
        }

        System.out.print("Enter a string:");
        String h = sc.nextLine();
        int words = 1, vowels = 0, conso = 0;
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == ' ') {
                words++;
            }
            if (h.toLowerCase().charAt(i) == 'a' || h.toLowerCase().charAt(i) == 'e' || h.toLowerCase().charAt(i) == 'i'
                    || h.toLowerCase().charAt(i) == 'o'
                    || h.toLowerCase().charAt(i) == 'u') {
                vowels++;
            } else {
                conso++;
            }
        }

        System.out.println("Words:" + words + "\nvowels:" + vowels + "\nconsonents:" + conso);

        sc.close();
    }
}
