package entities;

import java.util.Scanner;

public class ExceptionExapmple2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Harshit's Application");
		try {
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int res = a/b;
		System.out.println("The result is " + res);
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter non zero denominator");
		}
		
		try {
		System.out.println("Please enter size of an array");;
		int size = scan.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter the element to be added");
		int elem = scan.nextInt();
		System.out.println("Enter the position at which element has to be added");
		int pos = scan.nextInt();
	    ar[pos] = elem;
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Please enter posotive array size");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter array in the bond");
		}
		catch(Exception e) {
			System.out.println("Please enter proper input");
		}
		
		System.out.println("Thankyou for using our application");
		
	}
}