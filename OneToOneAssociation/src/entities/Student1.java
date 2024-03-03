package entities;

public class Student1 {
	private String name;
	private int id;
	
	Product product;
	
	public Student1(String name,int id,Product product){
		this.name = name;
		this.id = id;
		this.product = product;
	}
	
	public void show() {
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:  "+id);
		System.out.println("Book Id:     "+product.getId());
		System.out.println("Book Name:   "+product.getName());
		System.out.println("Book Price:  "+product.getPrice());
	}
	
}
