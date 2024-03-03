package entities;
import java.util.*;
public class LaunchLinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add("Harshit");
		l1.add("M");
		l1.add("Bengaluru");
		System.out.println(l1);
		
		l1.add(3, 70);
		System.out.println(l1);++
		
		l1.addFirst("Ineuron");
		l1.addLast("1Lakh");
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add("India");
		l2.offer("Bengaluru");
		System.out.println(l2);
	}
}