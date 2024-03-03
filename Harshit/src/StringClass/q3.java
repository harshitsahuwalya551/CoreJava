package StringClass;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "GlObAl";
		String str2 = "";
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)>'a' && str1.charAt(i)<='z') {
				str2 = str2 + (char)(str1.charAt(i)-32);
			}else {
				
			}
		}
		System.out.println(str2);
	}

}
