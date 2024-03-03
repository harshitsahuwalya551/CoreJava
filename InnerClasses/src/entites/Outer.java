package entites;

class Outer{
	class Inner{
		public void m1() {
			System.out.println("Inside m1 method and calling from static class ");
		}
	}
	public void m2() {
		Inner inner = new Inner();
		inner.m1();
	}
	public static void main(String[] args) {
		
//		Outer o = new Outer();
//		Outer.Inner i = o.new Inner();
//		i.m1();
		
//		Outer.Inner i = new Outer().new Inner();
//		i.m1();
		
		new Outer().new Inner().m1();
		
		Outer outer = new Outer();
		outer.m2();
	}
}