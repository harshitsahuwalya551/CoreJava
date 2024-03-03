package entities;

class Beta2{
	void disp() {
		try {
		System.out.println("Disp method");
		System.exit(0);
		}
		finally {
			System.out.println("Inside finally");
		}
	}
}

public class finallyVSexit {
	public static void main(String[] args) {
		Beta2 b = new Beta2();
		b.disp();
	}
}
