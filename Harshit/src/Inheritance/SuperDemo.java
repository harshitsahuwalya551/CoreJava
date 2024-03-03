package Inheritance;
class x{
	public x() {
		super();
		System.out.println("In x");
	}
	public x(int x) {
		supe r();
		System.out.println("x:"+x);
	}
}

class y extends x{
	public y() {
		super();
		System.out.println("In y");
	}
	public y(int x) {
		super(4);
		System.out.println("y:"+x);
	}
}
     
public class SuperDemo {
	public static void main(String args[]) {
		y obj = new y();
		y obj1 = new y(2);
		
	}
}