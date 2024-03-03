package JavaEnterPriseEdition;
import java.util.Iterator;
import java.util.Scanner;
public class LaunchArr3 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		
		int [][][]arr = new int[3][2][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					System.out.println("Please Enter marks for School "+i+" class "+j+" Student:"+j2);
					arr[i][j][j2]=sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					System.out.println("Marks for School "+i+" class "+j+" Student"+j2+" is:"+arr[i][j][j2]);
				}
			}
		}
	}

}
