package entities;

@FunctionalInterface
interface Alpha1{
	void disp();
}

public class AnonyInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha1 a = new Alpha1() {
			public void disp() {
				System.out.println("Hi");
			}
		};
		a.disp(); 
	}

}
