package entities;

public class Student1 {
	private int id;
	private String name;
	Course course;
	
	public Student1(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Student name:"+name);
		System.out.println("Student id:"+id);
		System.out.println("Course Name:"+course.getName());
		System.out.println("Course ID:"+course.getId());
		System.out.println("Course Price:"+course.getPrice());
	}
	
}
