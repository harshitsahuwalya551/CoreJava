package JavaEnterPriseEdition;
import java.util.Scanner;
public class LaunchArray {
	public static void main(String[] args) {
		int []a=new int[10];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<a.length;i++) {
			System.out.println("Please enter the marks of student "+i);
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<a.length;i++) {
			System.out.println("Marks of student " + i +":" + a[i]);
		}
		
		
		
	}
}

