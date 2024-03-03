package entities;
import java.util.*;

public class LaunchGenericArrayList {
	public static void main(String[] args) {
		//Generics Syntax
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("tendulkar");
		String f_name = al.get(0);
		String l_name = al.get(1);
		System.out.println(f_name+" "+l_name);
	}
}