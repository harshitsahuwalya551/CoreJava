package polymorphism;

class Demo1{
	final int a = 20;
    final public void display() {
		System.out.println("Parent"); 
    }
}

class Demo2 extends Demo1{
	public void display() {
		 
	}
}

public class LaunchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		d.display();
	}

}
