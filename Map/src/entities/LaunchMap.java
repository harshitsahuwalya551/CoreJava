package entities;
import java.util.*;
public class LaunchMap {
	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(10,"Sachin");
		hm.put(7,"Dhoni");
		hm.put(18,"Kohli");
		hm.put(45,"Rohit");
		System.out.println(hm);//hm.toString() will be called
		
		Set s = hm.keySet();//To get the key from map
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		Collection c = hm.values();//To get the value from map
		System.out.println(c);
		System.out.println(s.getClass().getName());
		
		Set mapData = hm.entrySet();//To get the K,V from the map
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		
		Iterator itr = mapData.iterator();
		while(itr.hasNext()) {
			Map.Entry data = (Map.Entry)itr.next();
			System.out.println(data.getKey() + ":" + data.getValue());
			if(data.getKey().equals(10)) {
				data.setValue("Harshit");
			}
		}
		System.out.println(hm);
		
		HashMap hs = new HashMap();
		hs.put(null, 0);
		hs.put(null, null);
		hs.put(null, "ABC");

		Set mapdata2 = hs.entrySet();
		Iterator itr2 = mapdata2.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}kab?
		
	}
	
}
