package test;
import entities.Branch;
import entities.Student;

public class TestApp {
	
	public static void main(String[] args) {
		
		//Creating a dependet object
		Branch branch = new Branch("IN01","VIJAYNAGAR");
		
		//Creating a target object
		Student s1 = new Student(10,"Sachin","49",branch);
		Student s2 = new Student(11,"Kohli","44",branch);
		Student s3 = new Student(7,"Dhoni","55",branch);
		
		System.out.println();
		s1.getStudentDisplay();
		System.out.println();
		s2.getStudentDisplay();
		System.out.println();		
		s3.getStudentDisplay();
	}

}
