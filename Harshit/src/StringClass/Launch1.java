package StringClass;

public class Launch1 {
	public static void main(String args[]) {
		String s1 = "Mango";
		String s2 = "Mango";
		String s3 = new String("Mango");
		String s4 = new String("Mango");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s4==s3);
	}
}
