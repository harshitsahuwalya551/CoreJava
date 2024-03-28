package entities;

public class Launch1 {
	public static void main(String[] args) {
		//static fectory method or singleton class
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1==r2);
	}
}
