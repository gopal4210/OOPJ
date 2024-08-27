package marketing;

import general.employee;

public class sales extends employee {

    public sales(int emp, String n) {
        super(emp, n);
    }

    public void tallo(int b) {
        System.out.println(0.05 * b);
    }
}