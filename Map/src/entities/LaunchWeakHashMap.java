package entities;
import java.util.*;
public class LaunchWeakHashMap {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		hm.put(t, "ABC");
		System.out.println(hm);
		
		t=null;//making eligible for Garbage Collection
		System.gc();//Triggering garbage collector thread to clean 't'
		Thread.sleep(5000);
		System.out.println(hm);
		
	}
}
class Temp{
	@Override
	public String toString() {
		return "temp";
	}
	@Override
	public void finalize() {
		System.out.println("Cleaning temp object");
	}
}
