package entities;

interface Calculator{
	void add();
	void sub();
}

class myCal1 implements Calculator{
	public void add() {
		System.out.println("Hello1");
	}
	public void sub() {
		System.out.println("Hellosub1");
	}
}

class myCal2 implements Calculator{
	public void add() {
		System.out.println("Hello2");
	}
	public void sub() {
		System.out.println("Hellosub2");
	}
}

class myCal3 implements Calculator{
	public void add() {
		System.out.println("Hello3");
	}
	public void sub() {
		System.out.println("Hellosub3");
	}
}

class Permit{
	public void permitt(Calculator c) {
		c.add();
		c.sub();
	}
}

class Launch {

	public static void main(String[] args) {
		myCal1 c1 = new myCal1();
		myCal2 c2 = new myCal2();
		myCal3 c3 = new myCal3();
		
		Permit p = new Permit();
		p.permitt(c1);
		p.permitt(c2);
		p.permitt(c3);
		
	}

}
