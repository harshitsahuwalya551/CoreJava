package entities;

public class LAunch12 {
	public static void main(String[] args) throws InterruptedException {
		Employee e = new Employee();
		
		e = null; //Garbage object
		System.gc(); //informing JVM to active thread to lcean garbage object
		Thread.sleep(5000);
	}
}

class Employee{
	@Override
	public void finalize() {
		System.out.println("Cleaning the object");
	}
}