package entites;
class Outer16{
	public void m1() {
		class Inner16{
			public void m1() {
				System.out.println("HIIII");
			}
		}
		Inner16 inner16 = new Inner16();
		inner16.m1();
	}
}
public class Demo {
	public static void main(String[] args) {
		new Outer16().m1();
	}
}
