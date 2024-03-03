package entities;
import java.util.*;

public class LaunchFailFastFailSafe {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i = 0;i<=al.size();i++) {
			System.out.println(al.get(i));
			al.add(99);
		}
		
//		for(Object o : al) {
//			System.out.println(o);
//			al.add(99);
//		}
		
	}
}
