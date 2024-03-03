package entities;

import java.util.Scanner;
interface Calculator{
	void add();
	void sub();
}

class  MyCalculator1 implements Calculator{
	public void add() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please enter first number to add");;
		int a = sca.nextInt();
		System.out.println("Please enter second number to add");;
		int b = sca.nextInt();
		int c = a+ b;
		System.out.println(c);
	}
	public void sub() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please enter first number to sub");;
		int a = sca.nextInt();
		System.out.println("Please enter second number to sub");;
		int b = sca.nextInt();
		int c = a - b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator{
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public void sub() {
		int a = 30;
		int b = 20;
		int c = a-b;
		System.out.println(c);		
	}
}

class Cal{
	public void permit(Calculator ref) {
		ref.add();
		ref.sub();
	}
}

public class Launch {
	public static void main(String[] args) {
		MyCalculator1 m1 = new MyCalculator1();
		MyCalculator1 m2 = new MyCalculator1();
		
		Cal c = new Cal();
		c.permit(m1);
		c.permit(m2);
	}
}
