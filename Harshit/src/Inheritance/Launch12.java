package Inheritance;

class Demo{
	int a,b,c;
	
	public Demo() {
		a = 10;
		b = 20;
		c =a +b;
	}
	public Demo(int x,int y) {
		c = x+y;
	}

	
}
class Demo3 extends Demo{
	int m,n,o;
	
	public Demo3() {
		m=10;
		n=20;
		o=m+n;
	}
	public Demo3(int x,int y) {
		o = x+y;
	}
	public void display() {
		System.out.println(c);
		System.out.println(o);
	}
	
}

public class Launch12 {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.display();
	}
}
