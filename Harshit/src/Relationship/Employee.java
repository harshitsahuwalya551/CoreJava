package Relationship;


//target class
public class Employee {
	private int eid;
	private String ename;
	private String eaddress;
	
	//HAS-A variable injection
	private Account account;
	
	//Performing constructor Injection 
	public Employee(int eid,String ename,String eaddress,Account account) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.account = account;
	}
	
	public void display() {
		System.out.println("Employee Details Are................");
		System.out.println("EID is ::"+eid);
		System.out.println("ENAME is ::"+ename);
		System.out.println("EADDR is::"+eaddress);
		System.out.println("***********Account Details Are***********");
		System.out.println("Account NAme is::"+account.accName());
		System.out.println("Account number is::"+account.getAccNo());
		System.out.println("Account type is::"+account.accType());

	}
}