package entities;

@FunctionalInterface
interface Computer1{
	void show();
}

//Implementing functional Interface with normal class
class Laptop implements Computer1{
	public void show() {
		System.out.println("In Show");
	}
}

public class LamdaDemo {
	public static void main(String[] args) {
		//Implementing functional Interface with lambda expression
		Computer1 com = () -> System.out.println("In Show 1");
			
		com.show();
		
	}
}
