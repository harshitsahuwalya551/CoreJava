package entities;

//target class
public class Department {
	
	private int deptNo;
	private String deptName;
	private String deptLoc;
	
	//Has-A variable
	private Employee[] employee;
	
	public Department(int deptNo,String deptName,String deptLoc,Employee[] employee) {
		this.deptNo = deptNo;
		this.deptLoc = deptLoc;
		this.deptName = deptName;
		this.employee = employee;
	}
	
	public void display() {
		System.out.println("Department Info");
		System.out.println("Department Number::"+deptNo);
		System.out.println("Department Name::"+deptName);
		System.out.println("Department Location::"+deptLoc);
		System.out.println("***********\nEmployee Details");
		for(Employee emp:employee) {
			System.out.println("**************");
			System.out.println("Student Id::"+emp.getId());
			System.out.println("Student Name::"+emp.getName());
	  
		}
	}
	
}
