package entities;

public class Student {
	private int id;
	private String name;
	private String bNranch;
	
	private Placement placement;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}
	
	public void display() {
		System.out.println("Procedural Details::");
		System.out.println("ID::"+id);
		System.out.println("NAME::"+name);
		System.out.println("BRANCH::"+branch);
		System.out.println("=============");
		System.out.println("Placement details");
		System.out.println("Name Of Company::"+placement.getName());
		System.out.println("He get placed at::"+placement.getLocaiton());
		System.out.println("His Salary is::"+placement.getSalary());
	}
}
