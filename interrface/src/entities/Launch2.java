package entities;

interface Calc1{
	void add(int a,int b);
}

interface Calc2{
	int sub(int a,int b);
}

class MyCalc implements Calc1,Calc2{
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	public int sub(int a,int b) {
		return a-b;
	}
}

public class Launch2 {
	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		c.add(10, 20);
		System.out.println(c.sub(30, 20));
	}
}
 