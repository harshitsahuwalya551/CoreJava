package JavaEnterPriseEdition;

import java.util.*;

public class LaunchJava2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter marks of class: " + i + " student: " + j);
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Marks of class: " + i + " student: " + j + "=" + arr[i][j]);
			}
		}

	}
}
