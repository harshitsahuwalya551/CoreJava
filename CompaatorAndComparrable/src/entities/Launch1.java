package entities;
import java.util.*;

class Student{
	int age;
	String name;
	String tech;
	
	public Student(int age, String name, String tech) {
		this.age = age;
		this.name = name;
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + name + ", tech ="+tech + "]";
	}
	
}

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(7);
		nums.add(2);
		
		Collections.sort(nums);
		
		System.out.println(nums);
		
		
		
	}

}
