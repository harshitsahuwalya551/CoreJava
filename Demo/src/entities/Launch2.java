package entities;

interface myCall{
	void add();
}

class myCall2{
	public void sub() {
		 System.out.println("hi");
	}
}

class Calculatorr1 extends myCall2 implements myCall{
		public void add() {
			System.out.println("Hi");
		}
		
}	

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr1 c = new Calculatorr1();
		c.sub();
		c.add();
	}

}