package association;

import Relationship.AccountS;
import Relationship.EmployeeS;

public class OneOneAssociationUsingSetter {
	public static void main(String[] args) {
		
		AccountS accountS = new AccountS();
		accountS.setAccName("Harshit");
		accountS.setAccNo("ISB-2001");
		accountS.setAccType("Current");
		
		
		EmployeeS employee = new EmployeeS();
		employee.setEid(1);
		employee.setEname("Harshit");
		employee.setEaddress("Dhanwar");
		employee.setAccount(accountS);
		
		employee.display();
	}
}
