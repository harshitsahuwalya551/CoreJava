package entities;

class tryException{
	public static void divide(int x,int y)throws ArithmeticException {
		if(y==0) {
			throw new ArithmeticException("we cant divide x by zero");
		}
	}
}
public class Demo1 {
	public static void main(String[] args)throws ArithmeticException{
		try {
		tryException.divide(5, 0);
		}catch (Exception e) {
			System.out.println("caught an erithmetic exception" + e.getMessage());
		}
	}
}