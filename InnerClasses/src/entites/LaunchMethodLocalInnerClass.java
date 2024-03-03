package entites;

public class LaunchMethodLocalInnerClass {
	public void m1() {
		class Inner14{
			public void sum(int x,int y) {
				System.out.println("Sum is " + (x+y));
			}
		}
		new Inner14().sum(10, 20);
	}
	public static void main(String[] args) {
		new LaunchMethodLocalInnerClass().m1();
	}
}
