package entities;
import java.util.*;

public class LaunchImportant1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		System.out.println("***********-----------");
		//enhanced for loop or for each loop
		for(Object o:l) {
			System.out.println(l);
		}
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add(200);
		l1.add("Ineuron");
		l1.add("Bengaluru");
		
		Iterator itr1 = l1.iterator();
		//while(itr1.hasNext()) {
//			LinkedList o = (LinkedList) itr1.next();
		//}
		
		System.out.println("********iter********");
		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add("Ineuron");
		ll2.add("Bengaluru");
		
		ListIterator litr = ll2.listIterator(ll2.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
					
	}
}
