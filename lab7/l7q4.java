import java.util.Scanner;

class ti {
    int hr;
    int min;
    int sec;

    public void inputtime() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour:");
        hr = sc.nextInt();
        System.out.print("Enter min:");
        min = sc.nextInt();
        System.out.print("Enter sec:");
        sec = sc.nextInt();
        sc.close();
        int x = 0;
        try {
            if (hr > 24 || hr < 0) {
                x = 1;
                throw new HrsException();
            }
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (min > 60 || min < 0) {
                x = 1;
                throw new MinException();
            }
        } catch (MinException f) {
            System.out.println(f.getMessage());
        }

        try {
            if (sec > 60 || sec < 0) {
                x = 1;
                throw new SecException();
            }
        } catch (SecException g) {
            System.out.println(g.getMessage());
        }

        if (x != 1) {
            System.out.println("Correct Time -> " + hr + ":" + min + ":" + sec);
        }
    }

}

class l7q4 {
    public static void main(String[] args) {
        ti t = new ti();
        t.inputtime();
    }
}

class HrsException extends Exception {
    HrsException() {
        super("\n\nException occurred:  InvalidHourException:hour should not be not greater than 24");
    }
}

class MinException extends Exception {
    MinException() {
        super("\n\nException occurred:  InvalidMinuteException:min should not be not greater than 60");
    }
}

class SecException extends Exception {
    SecException() {
        super("\n\nException occurred:  InvalidSecondException:sec should not be greater than 60");
    }
}