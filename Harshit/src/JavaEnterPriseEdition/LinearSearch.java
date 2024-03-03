package JavaEnterPriseEdition;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {2,3,4,2,4};
		int key = 3;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("Found at index_"+i );
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}
} 