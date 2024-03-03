package calculatorWithOops;

import java.util.Scanner;

abstract class Shapes{
	float area;
	
	abstract void input();
	abstract void compute();
	void disp() {
		System.out.println("The area is::"+area);
	}
}

class Rectangle extends Shapes{
	float l;
	float b;
	
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
}

class Square extends Shapes{
	float l;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the length of square");
		l = scan.nextFloat();
	}
	void compute() {
		area = l * l;
	}
}

class Circles extends Shapes{
	float rad;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the radius");
		rad = scan.nextFloat();
	}
	void compute() {
		area = 3.14f*rad*rad;
	}
}
//achieved polymorphism here
class Geometry{
	void permit(Shapes s) {
		s.input();
		s.compute();
		s.disp();
	}
}

public class LaunchCal {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circles c = new Circles();
		
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
	}
}
