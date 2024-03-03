package StringClass;
import java.util.*;

class Circle{
	private int radius;
	
	public void setRadius(int x) {
		this.radius = x;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double calculateArea() {
		
		double area = 3.14 * this.radius * this.radius;
		
		return area;
	}
	
	public double calculateParameter() {
		
		double para = 2 * 3.14 * this.radius;
		
		return para;
	}
}

public class PracticeEncapsulation3 {

	public static void main(String[] args) {
		
		Circle cal = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius:");
		int radius = sc.nextInt();
		cal.setRadius(radius);
		System.out.println(cal.calculateArea());
		System.out.println(cal.calculateParameter());
	}

}
