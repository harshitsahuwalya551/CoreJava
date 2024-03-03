package StringClass;
import java.util.*;

class Farmer{
	private float pa;
	private float td;
	static private float ri; //also known as class variable
	private float si;
	
	static {
		ri = 2.5f;
	}
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear, Kindly enter loan amount needed");
		pa = scan.nextFloat();
		System.out.println("Dear, Kindly time needed to repat");
		td = scan.nextFloat();
	}
	
	public void compute() {
		si = (pa*td*ri)/100;
	}
	
	public void display() {
		System.out.println("SI is" + si);
	}
	
}

public class LaunchFarmer {

	public static void main(String[] args) {

		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.display();
		
		f2.acceptInput();
		f2.compute();
		f2.display();
		
	}

}