package polymorphism;

class Plane{
	public void fly() {
		System.out.println("Plane is flying");
	}
	public void takeoff() {
		System.out.println("Plane is taking off");
	}
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("Cargo Plane flies at lower height");
	}
	public void takeoff() {
		System.out.println("Cargo Plane requires longer runway to take off");
	}
}
class FighterPlane extends Plane{
	public void fly() {
		System.out.println("FighterPlane is flies at high height");
	}
	public void takeoff() {
		System.out.println("Fighter Plane requires short runway to takeoff");
	}
}
class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("PassengerPlane is flies at Medium height");
	}
	public void takeoff() {
		System.out.println("Passenger Plane requires long runway to takeoff");
	}
}

class Airport{
	public void permit(Plane p) {
		p.takeoff();
		p.fly();
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();
		
//		Plane p;
//		p=cp;
//		
//		p.fly();
//		p.takeoff();
//		
//		p=fp;
//		p.fly();
//		p.takeoff();
//	
//		p = pp;
//		p.fly();
//		p.takeoff();
		
		Airport a = new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
	}

}
