package entities;
import java.util.ArrayList;
public class LaunchArrayList1 {
	public static void main(String[] args) {
	
		ArrayList al1 = new ArrayList();
		al1.add("Ineuron");
		al1.add('B');
		al1.add(4);
		al1.add(25.5);
		
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(40);
		System.out.println(al2);
		
		al2.addAll(al1);
		System.out.println(al2);
		
		System.out.println(al2.contains(20));
		System.out.println(al2.get(3));
		boolean a = al2.isEmpty();
		System.out.println(a);
		
		ArrayList al3 = new ArrayList();
		al3.add("Bengaluru");
		al3.add("India");
		al3.add(15);
		al3.add(20.5);
		System.out.println(al3);
		     	
		al3.clear();
		System.out.println(al3);
		System.out.println(al3.isEmpty());
		
		al3.ensureCapacity(5);
		al3.add("Bengaluru");
		al3.add("India");
		al3.add(15);
		al3.add(20.5);
		al3.add(20.5);
		al3.add(20.5);
		System.out.println(al3.size());
		al3.trimToSize();
		System.out.println(al3);
	
		
		
	}
}
