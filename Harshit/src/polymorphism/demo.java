package polymorphism;

class A{
	public static void disp() {
		System.out.println("Classs A");
	}
}
class B extends A{
	public static void disp() {
		System.out.println("Classs B");
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa= new B();
		aa.disp();
	}

}
