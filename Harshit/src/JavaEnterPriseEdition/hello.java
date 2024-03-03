//package JavaEnterPriseEdition;
//
//
//class Calculator{
//	
//	public int addTwoNumbers(int n1,int n2){
//		
//		int result = n1+n2;
//		return result;
//	}
//	
//	public int addThreeNumbers(int n1,int n2,int n3){
//		
//		int result = n1+n2+n3;
//		return result;
//	}
//}
//
//public class hello {
//	public static void main(String args[]) {
//		int num1 = 5;
//		int num2 = 6;
//		int num3 = 7;
//		
//		Calculator calc = new Calculator();
//		int result = calc.addThreeNumbers(num1,num2,num3);
//		int result1 = calc.addTwoNumbers(num1,num2);
//		System.out.println(result);
//		System.out.println(result1);
//	}
//}

//--------------------------------------------

//package JavaEnterPriseEdition;
//
//
//class Calculator{
//	
//	public int add(int n1,int n2){
//		
//		int result = n1+n2;
//		return result;
//	}
//	
//	public int add(int n1,int n2,int n3){        //method overloading
//		
//		int result = n1+n2+n3;
//		return result;
//	}
//}
//
//public class hello {
//	public static void main(String args[]) {
//		int num1 = 5;
//		int num2 = 6;
//		int num3 = 7;
//		
//		Calculator calc = new Calculator();
//		int result = calc.add(num1,num2,num3);
//		int result1 = calc.add(num1,num2);
//		System.out.println(result);
//		System.out.println(result1);
//	}
//}
	

//=============-------------------------Scanner

package JavaEnterPriseEdition;
import java.util.Scanner;

class Calculator{
	
	public int add(int n1,int n2){
		
		int result = n1+n2;
		return result;
	}
	
	public int add(int n1,int n2,int n3){        //method overloading
		
		int result = n1+n2+n3;
		return result;
	}
}

public class hello {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num1 = sc.nextInt();
		
		Calculator calc = new Calculator();
		int result = calc.add(num1,num2,num3);
		int result1 = calc.add(num3,num2);
		System.out.println(result);
		System.out.println(result1);
	}
}