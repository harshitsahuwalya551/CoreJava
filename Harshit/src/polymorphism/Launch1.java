package polymorphism;

class Telusko{
	public static void display() {
		System.out.println("Telusko is parent");
	}
}

class Alien extends Telusko{
	public static void display() {
		System.out.println("Alien is telusko");
	}
}

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a = new Alien();
		a.display();
		Telusko b = new Alien();
		b.display();
	}

}
