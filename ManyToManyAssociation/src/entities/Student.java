package entities;

public class Student {
	private int sid;
	private String sname;
	private int sage;
	
	//has-a variable
	private Course[] course;

	public Student(int sid, String sname, int sage, Course[] course) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Student Details::");
		System.out.println("Name::"+sname);
		System.out.println("ID::"+sid);
		System.out.println("Age::"+sage);
		
		System.out.println("Cources they opted::");
		for(Course cource : course) {
			System.out.println("ID::"+cource.getCid());
			System.out.println("NAME::"+cource.getCname());
			System.out.println("COST::"+cource.getCost());
		}
	}
	
}