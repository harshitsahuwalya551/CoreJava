package entities;

import java.util.Scanner;

class Alpha2{
	public void division() throws ArithmeticException{
		try {
		System.out.println("Harshit's Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int res = a/b;
		System.out.println("The result is " + res);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in division method only");
			throw e;
		}
		finally {
		System.out.println("Thankyou for using my applicationb");
		}
	}
}

public class RethrowingExceptionn {
	public static void main(String[] args) {
		System.out.println("Main method connection1 established");
		try {
		Alpha2 a = new Alpha2();
		a.division();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in main");
		}
	}
}