package lab5;

interface motor {
    int capacity = 100;

    void run();

    void consume();
}

class washing_machine implements motor {
    public void run() {
        System.out.println("Washing machine motor is running");
    }

    public void consume() {
        System.out.println("Washing machine motor is consuming power");
    }

    public void check(){
        System.out.println("Capacity is "+motor.capacity);
    }
}

class l5q2{
    public static void main(String[] args) {
        washing_machine w=new washing_machine();
    
        w.check();
    }
}