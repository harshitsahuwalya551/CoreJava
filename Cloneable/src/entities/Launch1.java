package entities;

public class Launch1 implements Cloneable {
	int i = 10;
	int j = 20;
	public static void main(String[] args) throws CloneNotSupportedException {
		Launch1 l1= new Launch1();
		Launch1 l2 = (Launch1)l1.clone();
		l2.i=111;
		l2.j=222;
		System.out.println(l1.i+"=========>"+l1.j);
		System.out.println(l2.i+"=========>"+l2.j);
	}
}
