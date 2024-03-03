package entities;

import java.util.*;

class InavlidUserException extends Exception{
	InavlidUserException(String msg){
		super(msg);
	}
}

class ATM{
	private int accNum = 1111;
	private int password = 2222;
	private int acc;
	private int pw;
	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account Number");
		acc = scan.nextInt();
		System.out.println("Enter your password");
		pw = scan.nextInt();
	}
	
	public void verify() throws InavlidUserException {
		if(accNum == acc && password == pw) {
			System.out.println("Collect  your cash");
		}else {
//			InavlidUserException iue = new InavlidUserException();
//			System.out.println("Invalid Credentials");
//			throw iue;
			throw new InavlidUserException("Invalid credintials!");
		}
	}
}

class Bank{
	public void initiate() {
		ATM a = new ATM();
		try {
		a.input();
		a.verify();
		}
		catch(InavlidUserException e) {
			try {
				System.out.println(e.getMessage());
				a.input();
				a.verify();
			} catch (InavlidUserException e1) {
				try {
					System.out.println(e.getMessage());
					a.input();
					a.verify();
				}
				catch(InavlidUserException e2) {
					System.out.println("Card is blocked TATA BYE BYE");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.initiate();
	}
}
