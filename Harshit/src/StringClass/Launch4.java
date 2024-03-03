package StringClass;

public class Launch4 {

	public static void main(String[] args) {
		String s1 = "Harsh" + "Kumar";
		System.out.println(s1); //HarshKumar
		
		String s2 = "Harsh" + 99;
		System.out.println(s2); //Harsh99
		
		String s3 = "Harsh" + 99 + 99 + 10;
		System.out.println(s3); //Harsh999910

		String s4 = 15 + 4 + "Kumar";
		System.out.println(s4);
	}

}
