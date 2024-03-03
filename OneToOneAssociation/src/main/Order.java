package main;
import entities.Product;
import entities.Student1;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(1, 100, "JAVA");
		
		Student1 s1 = new Student1("Harshit", 12217301, p1);
		
		s1.show();
		
	}

}      
