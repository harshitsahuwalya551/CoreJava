package StringClass;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india";
		String str1 = "";	
		for(int i =0 ;i<str.length();i++) {
			str1 = str1 + (char)(str.charAt(i)-32);
		}
		System.out.println(str1);
	}

}  
