package entities;

public class Course {
	
	private String cid;
	private String cname;
	private int cost;
	
	//constructor injection
	public Course(String cid, String cname, int cost) {
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	//Getters to send the data
	public String getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public int getCost() {
		return cost;
	}
	
	
	
}