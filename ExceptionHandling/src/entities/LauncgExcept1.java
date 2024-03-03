package entities;

import java.util.*;

class Alpha1{
	public void division() {
		
		System.out.println("Harshit's Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		int res = a/b;
		System.out.println("The result is " + res);
		System.out.println("Thankyou for using my applicationb");
		scan.close();
	}
}
class Beta1{
	public void display() {
		Alpha1 a = new Alpha1();
		a.division();
	}
}

public class LauncgExcept1 {
	public static void main(String[] args) {
		Beta1 b = new Beta1();
		try {
		b.display();
		}
		catch(Exception e) {
			System.out.println("Please enter non zero number");
		}
	}
}