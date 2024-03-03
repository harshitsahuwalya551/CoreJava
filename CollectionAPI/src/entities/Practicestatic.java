package entities;

class Demo1{
	static {
		System.out.println("Static method");
	}
	public static void add(int x) {
		System.out.println(x);
	}
}

public class Practicestatic {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		int x = 5;
		Demo1.add(x);
		System.out.println("dafa");
	}
}