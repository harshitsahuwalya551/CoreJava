package StringClass;

public class capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sc = new StringBuffer(1000);
		System.out.println(sc.capacity());
		sc.append("Savitri Devi");
		System.out.println(sc.capacity());
		sc.trimToSize();
		System.out.println(sc.capacity()); 
	}

}
