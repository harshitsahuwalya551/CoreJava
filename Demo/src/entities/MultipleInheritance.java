package entities;

interface Calculator{
	void add();
}

interface myCal1 extends Calculator{
	void sub();
}

interface myCal2 extends Calculator{
	void mul();
}

class myCal3 implements myCal1,myCal2{
	public void add() {
		System.out.println("Addition Method");
	}
	public void sub() {
		System.out.println("Subtraction Method");
	}
	public void mul() {
		System.out.println("Multiplication Method");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
