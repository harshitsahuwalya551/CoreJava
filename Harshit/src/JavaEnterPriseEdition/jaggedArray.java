package JavaEnterPriseEdition;
import java.util.Scanner;
public class jaggedArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter marks of class:"+i+" ,student:"+j);
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[1].length;j++) {
				System.out.println("Marks of class:"+i+" ,student:"+j+",is"+a[i][j]);
			}
		}
	}
}