package entites;

class Outer1{
	class Inner{
		public void m1() {
			System.out.println("Inner class instance m1()");
		}
	}
}

public class Launch2 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner i = o.new Inner();
		i.m1();
	}
}
