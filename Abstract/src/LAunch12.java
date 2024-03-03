
abstract class Calculator{
	abstract int add();
	abstract int add(int a,int b);
}

class Cal extends Calculator{
	public int add(){
		int a=10;
		int b=20;
		int c=a+b;
//		System.out.println(c);
		return c;
	}
	public int add(int a,int b) {
		int c = a+b;
		return c;
	}
}

public class LAunch12 {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.add());
		System.out.println(c.add(7,8));
	}
}
