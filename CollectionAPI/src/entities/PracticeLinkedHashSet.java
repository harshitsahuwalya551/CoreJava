package entities;
import java.util.*;
public class PracticeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ll = new LinkedHashSet();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			itr.next();
		}
		System.out.println(ll);
	}
}