package entities;

//Dependent class
public class Employee {
	//instance variables
	private int eid;
	private String ename;
	
	//constructor to inject values
	public Employee(int eid,String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
	//getters to send the value
	public int getId() {
		return eid;
	}
	public String getName() {
		return ename;
	}
	
}
