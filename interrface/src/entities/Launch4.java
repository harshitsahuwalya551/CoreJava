package entities;

interface Demo1{
	void display();
	default void show() {
		System.out.println("Hello");
	}
}
class Demo2 implements Demo1{
	public void display() {
	    System.out.println("Helloo");
	}
	public void show() {
		System.out.println("HEeee");
	}
}

public class Launch4 {
	public static void main(String[] args) {
		
	Demo1 d = new Demo2();
	d.display();
	d.show();
	}
	
}
