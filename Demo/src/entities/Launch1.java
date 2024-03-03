package entities;

interface Calculator1{
	void add();
}

interface Calculator2{
	void add();
}

class myCal implements Calculator1,Calculator2{
	public void add() {
		System.out.println("I am add method");
	}
	public void sub() {
		System.out.println("I am sub method");
	}
}

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCal c = new myCal();
		c.add();
		c.sub();
	}

}
