package entities;

//target Object
public class Student {
	//instance variable
	private int sid;
	private String sname;
	private String sage;
	
	//Has-A variable injection should happen
	private Branch branch;
	
	//constructor injection
	public Student(int sid,String sname,String sage,Branch branch) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	
	public void getStudentDisplay() {
		System.out.println("Student Details are::");
		System.out.println("SID is::"+sid);
		System.out.println("SNAME is::"+sname);
		System.out.println("SAGE is::"+sage);
		
		System.out.println("--------------------");
		System.out.println("Branch Details are::");
		System.out.println("BID is ::"+ branch.getBid());
		System.out.println("BNAME is ::"+ branch.getBloc());
	}
}
