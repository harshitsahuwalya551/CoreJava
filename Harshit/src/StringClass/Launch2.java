package StringClass;
public class Launch2 {
	public static void main(String[] args) {
		String s1 = "Sehwag";
		String s2 = "Sehwag";
		int res = s1.compareTo(s2);	
		if(res==0) {
			System.out.println("String is same");
		}else {
			System.out.println("Strings are not same");;
		}
	}
}