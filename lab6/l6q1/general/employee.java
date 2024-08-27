package general;

public class employee {
	int empid;
	// private String ename;

	public employee(int emp, String n) {
		empid = emp;
		// ename = n;
	}

	public void earning(int b) {
		System.out.println("Earning=" + (b + 0.8 * b + 0.15 * b));
	}
}