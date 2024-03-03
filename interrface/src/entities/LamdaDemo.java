package entities;


interface Computer1{
	void show();
}

class Laptop implements Computer1{
	public void show() {
		System.out.println("In Show");
	}
}

public class LamdaDemo {
	public static void main(String[] args) {
		Computer1 com = () -> System.out.println("In Show 1");
			
		com.show();
		
	}
}
