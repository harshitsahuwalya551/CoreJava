package entities;

class Student1 implements Comparable<Student1>{
	int age;
	String name;
	String tech;
	
	public Student1(int age,String name,String tech) {
		this.name = name;
		this.age = age;
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [age="+age+" , Name="+name+" , Tehnology="+tech+"]\n";
	}
	
	//sorting with age
	@Override
//	public int compareTo(Student that) {
//		return that.age - this.age;
//	}
	
	//-->Sorting with name
	public int compareTo(Student1 that) {
		return that.name.compareTo(name);
	}
}