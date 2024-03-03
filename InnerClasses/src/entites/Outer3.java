package entites;

class Outer3 {
	int x = 10;
	class Inner3{
		int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println(x);//1000
			System.out.println(this.x);//100
			System.out.println(Outer3.this.x);
		}
	}
	public static void main(String[] args) {
		
		new Outer3().new Inner3().m1();
		
	}
}