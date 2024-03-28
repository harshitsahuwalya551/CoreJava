package entities;

class Student{
	static {
		System.out.println("Student class is loading");
	}
	public Student(){
		System.out.println("Class object created");
	}
}

public class Launch1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Student std = (Student)(Class.forName(args[0]).newInstance());
	}
}
