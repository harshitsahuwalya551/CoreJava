package main;
import entities.Course;
import entities.Student;

public class test {
	public static void main(String[] args) {
		Course c1 = new Course("1","JAVA",23000);
		Course c2 = new Course("2","Cpp",21000);
		Course c3 = new Course("3","Admin",20000);
		
		Course[] csc1 = new Course[2];
		csc1[0] = c1;
		csc1[1] = c2;
		
		Course[] csc2 = new Course[1];
		csc2[0] = c3;
		
		Student s1 = new Student(1,"Harshit",23,csc1);
		Student s2 = new Student(2,"Haniya",34,csc2);
		
		s1.display();
		s2.display();
	}
}
