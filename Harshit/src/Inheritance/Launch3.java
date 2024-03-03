package Inheritance;

class Harshit{
	public static void display() {
		System.out.println("Harshit is parent");
	}
}

class Alien extends Harshit{
	public static void display() {
		System.out.println("Alien is Harshit");
	}
}

public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a = new Alien();
		a.display();
	}

}
