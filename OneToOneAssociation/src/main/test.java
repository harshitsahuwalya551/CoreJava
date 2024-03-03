package main;

import entities.Student;
import entities.Placement;

public class test {
 public static void main(String[] args) {
	Placement p = new Placement();
	p.setName("Harshit");
	p.setLocation("Mumbai");
	p.setSalary("100000");
	
	Student s = new Student();
	s.setId(12217301);
	s.setName("Harshit");
	s.setBranch("Software Associate Develoeper");
	s.setPlacement(p);
	
	s.display();
	
}
}
