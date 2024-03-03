package entities;
import java.util.*;

//class Student1 implements Comparable<Student1>{
//	int age;
//	String name;
//	String tech;
//	
//	public Student1(int age,String name,String tech) {
//		this.name = name;
//		this.age = age;
//		this.tech = tech;
//	}
//	@Override
//	public String toString() {
//		return "Student1 [age="+age+" , Name="+name+" , Tehnology="+tech+"]\n";
//	}
//	
//	//sorting with age
//	@Override
////	public int compareTo(Student1 that) {
////		return that.age - this.age;
////	}
//	
//	//-->Sorting with name
//	public int compareTo(Student1 that) {
//		return that.name.compareTo(name);
//	}
//}

class ComparatorImpl implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2) {
		return s1.age - s2.age;
	}
}

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Student1> nums = new ArrayList<>();
		nums.add(new Student1(22,"Harshit","JAVA"));
		nums.add(new Student1(21,"HArsh","Cpp"));
		nums.add(new Student1(20,"Rohit","C"));
		Comparator<Student1> com = new ComparatorImpl();
		Collections.sort(nums, com );
		System.out.println(nums);
     
		
	}
	

}
