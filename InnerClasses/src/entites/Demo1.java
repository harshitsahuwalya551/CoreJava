package entites;

class Outer17{
	public static void m1() {
		//We can cannot create a static
		class Inner17{
			public void m2() {
				System.out.println("Hiiiii");
			}
		}
		new Inner17().m2();
	}
}

public class Demo1 {
	public static void main(String[] args) {
		new Outer17().m1();
	}
}
