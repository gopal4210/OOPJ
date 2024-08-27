package lab4;

class apple {
    void show() {
        System.out.println("Apple");
    }
}

class banana extends apple {
    void show() {
        System.out.println("Banana");
    }
}

class cherry extends apple {
    void show() {
        System.out.println("Cherry");
    }
}

class l4q3 {
    public static void main(String[] args) {
        apple a = new apple();
        a.show();

        apple b = new banana();
        b.show();

        apple c = new cherry();
        c.show();
    }
}