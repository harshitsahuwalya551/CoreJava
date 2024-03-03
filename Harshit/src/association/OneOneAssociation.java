package association;

import Relationship.Account;
import Relationship.Employee;

public class OneOneAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("ISB-2001","Savings","Harshit");
		Employee employee = new Employee(1,"Harshit","Rajdhanwar",account);
		
		employee.display();
	}

}
