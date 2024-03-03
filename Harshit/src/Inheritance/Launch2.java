package Inheritance;

class Plane{
	protected void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends Plane{
	public void fly() {
		System.out.println("Cargo plane flies at lower height");
	}
}

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
