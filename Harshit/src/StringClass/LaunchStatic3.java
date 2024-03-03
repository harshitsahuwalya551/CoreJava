package StringClass;

class Demo{
	
	public static void display1() {
		System.out.println("Static method");
	}
	
	public void display2() {
		System.out.println("Non Static method");		
	}
	
}

public class LaunchStatic3 {

	public static void main(String[] args) {
		
		Demo.display1(); 
		Demo d = new Demo();
		d.display1();
		d.display2();
		
	}

}
