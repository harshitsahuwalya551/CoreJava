package Relationship;


//target class
public class EmployeeS {
	private int eid;
	private String ename;
	private String eaddress;
	
	//HAS-A variable injection
	private AccountS account;
	
	//Performing constructor Injection 
	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public void setAccount(AccountS accountS) {
		this.account = accountS;
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