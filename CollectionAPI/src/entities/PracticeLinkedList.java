package entities;
import java.util.*;

public class PracticeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.addFirst(0);
		al.addLast(0);
		al.remove();
		al.add(null);
		System.out.println(al);
		
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
