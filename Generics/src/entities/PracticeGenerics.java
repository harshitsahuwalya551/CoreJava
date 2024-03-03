package entities;
import java.util.*;

public class PracticeGenerics {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(30);
		ar.add(null);
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		
	}

}
