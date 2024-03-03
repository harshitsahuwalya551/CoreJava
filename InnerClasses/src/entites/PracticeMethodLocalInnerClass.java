package entites;

public class PracticeMethodLocalInnerClass {
	public void m1() {
		class Inner15{
			public void m1() {
				System.out.println("I am method local inner class");
			}
		}
		Inner15 inner15 = new Inner15();
		inner15.m1();
	}
	public static void main(String[] args) {
		new PracticeMethodLocalInnerClass().m1();
	}
}
