package StringClass;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Harshit";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		
		//Think Twice -- Twice Think
		 
		String s3 = "Think Twice";
		String s4 = "";
		
		String a[] = s3.split(" ");
		
		for(int i=a.length-1 ;i>=0;i--) {
			s4 = s4 + a[i] +" ";
		}
		System.out.println(s4);
		
		
		//palindrome
		
		
		Scanner sc =  new Scanner(System.in);
		String s5 = sc.next();
		String s6 = "";
		
		for(int i=s5.length()-1;i>=0;i--) {
			s6 = s6 + s5.charAt(i);
		}
		if(s5.equals(s6)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}