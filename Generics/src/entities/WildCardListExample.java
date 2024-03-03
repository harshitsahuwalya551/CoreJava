package entities;
import java.util.*;
public class WildCardListExample {

	public static void printList(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		stringList.add("World");
		System.out.println("String List:");
		printList(stringList);
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(2);
		
		System.out.println("Integer List:");
		printList(integerList);
		
	}

}
