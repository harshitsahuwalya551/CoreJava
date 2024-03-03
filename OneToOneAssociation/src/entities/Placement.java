package entities;

public class Placement {
	private String pname;
	private String ploc;
	private String psalary;
	
	public void setName(String pname) {
		this.pname = pname;
	}
	
	public void setLocation(String ploc)
	{
		this.ploc = ploc;
	}
	
	public void setSalary(String psalary) {
		this.psalary = psalary;
	}
	
	public String getName() {
		return pname;
	}
	
	public String getLocaiton() {
		return ploc;
	}
	
	public String getSalary() {
		return psalary;
	}
	
}
