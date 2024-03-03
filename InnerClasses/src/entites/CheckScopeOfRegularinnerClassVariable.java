package entites;

public class CheckScopeOfRegularinnerClassVariable {
	int x = 10;
	class Inner13{
		int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println(x); //1000
			System.out.println(this.x); //100
			System.out.println(CheckScopeOfRegularinnerClassVariable.this.x);//10
		}
	}
	public static void main(String[] args) {
		new CheckScopeOfRegularinnerClassVariable().new Inner13().m1();
	}

}
