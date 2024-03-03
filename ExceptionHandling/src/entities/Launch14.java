package entities;

class Demo10{
	void disp() {
		System.out.println("Parent class overriden method");
	}
}
class Demo12 extends Demo10{
	void disp() {
		System.out.println("Child class overriden method");
	}
}

public class Launch14 {
	public static void main(String[] args) {
		Demo12 d = new Demo12();
		d.disp();
	}
}
