package entities;

class Demo{
	
	private static Demo d = null;
	
	private Demo() {
		
	}
	public static Demo getDemo() {
		if(d==null){
			d = new Demo();
		}
		return d;
	}
}

public class OurOwnSingletonClass {
	public static void main(String[] args) {
		Demo d1 = Demo.getDemo();
		Demo d2 = Demo.getDemo();
		System.out.println(d1==d2);
	}
}
