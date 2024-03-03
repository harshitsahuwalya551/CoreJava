package entities;
import java.util.*;

public class PracticeArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque ad = new ArrayDeque();
		ad.push(10);
		ad.push(30);
		ad.push(130);
		ad.push(30);
		ad.pop();
		System.out.println(ad);
		ad.addFirst(10);
		ad.addLast(ad);
		
	}
}