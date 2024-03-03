package Relationship;

//dependend Object
public class Account {
	
	//instance variables
	private String accNo;
	private String accType;
	private String accName;
	
	//Performing constructor injection
	public Account(String accNo, String accType, String accName) {
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
	}
	
	
	public String getAccNo() {
		return accNo;
	}
	public String accType() {
		return accType;
	}
	public String accName() {
		return accName;
	}
}
