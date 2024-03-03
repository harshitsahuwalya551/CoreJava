package entites;
     
public class Outer12 {
	class Inner12{
	 	public void m1() {
	 		System.out.println("Inner class instance m1()");
	 	}
	}
	public static void main(String[] args) {
	 	Outer12 outer12 = new Outer12();
	 	Outer12.Inner12 inner12 = outer12.new Inner12();
	 	inner12.m1();
	 	new Outer12().new Inner12().m1();
	}
}    