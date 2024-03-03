package main;

import entities.Department;
import entities.Employee;

public class Test {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"Harshit");
		Employee emp2 = new Employee(2,"Harsh");
		Employee emp3 = new Employee(3,"Hati");
		
		Employee[] employee = new Employee[3];
		employee[0] = emp1;
		employee[1] = emp2;
		employee[2] = emp3;
		
		Department dep = new Department(1,"ICCI","India",employee);
		dep.display();
		
	}
}
