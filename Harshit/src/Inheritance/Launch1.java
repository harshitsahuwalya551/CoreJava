package Inheritance;


public class Launch1 {

	public static void main(String[] args) {

		MaheshCalc obj1 = new MaheshCalc();
		int result = obj1.add(2,4);
		System.out.println("Result:"+result);
		
		int result1 = obj1.sub(7, 2);
		System.out.println("Result1:"+result1);
		
		int result2 = obj1.mul(8, 9);
		System.out.println("Multiplication:"+result2);
	}

}