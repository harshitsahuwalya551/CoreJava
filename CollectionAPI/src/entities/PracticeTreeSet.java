package entities;
import java.util.*;

public class PracticeTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(4);
		t.add(150);
		t.add(50);
		t.add(300);
//		t.add("Harhsot");
		System.out.println(t);
		
		Iterator itr = t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
