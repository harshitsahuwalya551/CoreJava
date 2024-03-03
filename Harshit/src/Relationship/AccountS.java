package Relationship;

//dependend Object
public class AccountS {
	
	//instance variables
	private String accNo;
	private String accType;
	private String accName;
	
	//Performing constructor injection
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public void setAccName(String accName) {
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
