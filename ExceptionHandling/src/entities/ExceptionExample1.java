package entities;
import java.util.*;

public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Division Performing Applicaitgon");
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		
		int res = a/b;
		System.out.println("The result is " + res);
		System.out.println("0Thankyou for using our application");
		}
		catch(Exception e){
			System.out.println("Please provide non zero denominator");
		}
		System.out.println("Thankyou");
	}
}
