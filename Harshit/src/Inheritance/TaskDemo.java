package Inheritance;

//super class
class A extends Object{  
	int i = 5;
	public void show() {
		System.out.println("In A show");
	}
}

//sub class
class B extends A{
	int i = 7;
	public void printIValue() {
		int i = 9;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
		
public class TaskDemo {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show();
//		System.out.println(obj.i);
		obj.printIValue();
	}

}