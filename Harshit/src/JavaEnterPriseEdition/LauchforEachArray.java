package JavaEnterPriseEdition;

public class LauchforEachArray {

	public static void main(String[] args) {
		
		int [][]a = {{1,2,3,4,5},{2,4,3,2,1}};
		
		for(int ar[] : a) {
			for(int element : ar) {
				System.out.println(element);
			}
		}

	}

}
