package entities;
import java.util.*;

class UnderAgeException extends Exception{
	UnderAgeException(String msg){
		super(msg);
	}
}

class OverAgeException extends Exception{
	OverAgeException(String msg){
		super(msg);
	}
}

class LApp{
	private int age;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you age to check eligibility");
		age = scan.nextInt();
	}
	
	public void verify() throws OverAgeException,UnderAgeException {
		if(age>=18 && age<60) {
			System.out.println("You are eligible");
		}else if(age<18) {
			throw new UnderAgeException("You are underage you cannot apply for licence");		
		}else if(age>60){
			throw new OverAgeException("You are overage you cannot apply");
		}
	}
}

class RTO{
	void initiate() {
		LApp la = new LApp();
		try {
			la.input();
			la.verify();
		}
		catch(UnderAgeException a) {
			System.out.println(a.getMessage());
			try {
				la.input();
				la.verify();
			}
			catch(UnderAgeException b) {
				System.out.println(b.getMessage());
				System.out.println("Seems suspicius");
				System.exit(0);
			}
			catch(OverAgeException c) {
				System.out.println(c.getMessage());
				System.out.println("Seems suspicius");
				System.exit(0);				
			}
		}
		catch(OverAgeException oae) {
			System.out.println(oae.getMessage());
			try {
				la.input();
				la.verify();
			}
			catch(UnderAgeException e) {
				System.out.println("Seems suspicius");
				System.exit(0);
			}
			catch(OverAgeException f) {
				System.out.println("Seems suspicius");
				System.exit(0);				
			}
		}
	}
}

public class CustomeException2 {

	public static void main(String[] args) {
		RTO r = new RTO();
		r.initiate();
	}

}
