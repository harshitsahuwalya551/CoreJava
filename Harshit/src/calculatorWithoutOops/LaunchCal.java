package calculatorWithoutOops;
import java.util.*;

class Rectangle{
	float l;
	float b;
	float area;
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the length of rectang;e");
		l = scan.nextFloat();
		System.out.println("Please Enter the breath of rectangle");
		b = scan.nextFloat();
	}
	void compute() {
		area = l * b;
	}
	void disp() {
		System.out.println("Area of rectangle is::"+area);
	}
}

class Square{
	float l;
	float area;
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the length of square");
		l = scan.nextFloat();
	}
	void compute() {
		area = l * l;
	}
	void disp() {
		System.out.println("Area of square is::"+area);
	}
}

class Circles{
	float rad;
	float area;
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the radius");
		rad = scan.nextFloat();
	}
	void compute() {
		area = 3.14f*rad*rad;
	}
	void disp() {
		System.out.println("Area of circle is::"+area);
	}
}

public class LaunchCal {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circles c = new Circles();
		
		r.input();
		r.compute();
		r.disp();
		
		s.input();
		s.compute();
		s.disp();
		
		c.input();
		c.compute();
		c.disp();
	}

}
