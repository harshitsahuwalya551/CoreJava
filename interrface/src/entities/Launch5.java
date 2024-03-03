package entities;

interface Telusko{
	void disp();
	static void show() {
		System.out.println("I am static of an interface");
	}
}

public class Launch5 {
	public static void main(String[] args) {
		Telusko.show();
	}
}