package entities;


import java.util.*;

class Alpha{
	public void division()throws ArithmeticException {
		
		System.out.println("Harshit's Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int res = a/b;
		System.out.println("The result is " + res);
		System.out.println("Thankyou for using my applicationb");
		
	}
}
class Beta{
	public void display() {
		try {
		Alpha a = new Alpha();
		a.division();
		}
		catch(Exception e) {
			System.out.println("Please enter non zero number");
		}
	}
}

public class DuckingExample {
	public static void main(String[] args) {
		Beta b = new Beta();

		b.display();
		
	}
}