package entites;

public class RegularInnerClass {
	
	class InnerClass{
		public void m1() {
			System.out.println("Inner Class Instance m1()");
		}
	}
	public void m2() {
		System.out.println("Outer class instance m2()");
		InnerClass innerClass = new InnerClass();
		innerClass.m1();
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		// first we need to create the outer class object then with the outer class 
		//reference we have to create inner class object and then with inner class 
		//refrence we can call inner class method
		new RegularInnerClass().new InnerClass().m1();
		RegularInnerClass regularInnerClass = new RegularInnerClass();
		regularInnerClass.m2();
	}
}
//here is two classes Outer and inner and for those classes two .class
//file will be generated RegularInnerClass.class and RegularInnerClass$Outer.class

