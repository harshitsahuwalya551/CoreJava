package entities;
import java.util.*;

public class LaunchArrayDeque {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Ineuron");
		ad.add("Bengaluru");
		
		System.out.println(ad);
		
		ad.addFirst(100);
		ad.addLast(300);
		ad.addLast(200);
		System.out.println(ad);
	}
}
