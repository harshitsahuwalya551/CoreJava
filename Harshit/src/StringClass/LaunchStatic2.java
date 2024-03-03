package StringClass;

public class LaunchStatic2 {
	
	static int a,b,c;
	
	static
	{
		System.out.println("System Block");
		a=10;
		b=20;
		c=30;
	}
	
	static void disp1() {
		System.out.println("Static method display1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	 
	int m,n,o;
	
	{
		System.out.println("Non static block");
		m=100;
		n=200;
		o=300;
	}
	
	void disp2() {
		System.out.println("Non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
	
	public static void main(String[] args) {

		System.out.println("Main Method");
		disp1();
		LaunchStatic2 l = new LaunchStatic2();
		l.disp2();
		
	}

}