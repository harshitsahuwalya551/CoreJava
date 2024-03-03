package entities;

class Pairr<T, U>{
	private T first;
	private U second;
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(U second) {
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}

public class PracticeUserDefinedGenericUsingConstructor {

	public static void main(String[] args) {

		Pairr<String, Integer> nameAndId = new Pairr<String, Integer>();
		nameAndId.setFirst("Harshit");
		nameAndId.setSecond(12217301);
		
		Pairr<String, String> padAndtAd = new Pairr<String, String>();
		padAndtAd.setFirst("Dhanwar");
		padAndtAd.setSecond("Phagwara");
		
		System.out.println(nameAndId.getFirst());
		System.out.println(nameAndId.getSecond());
		System.out.println(padAndtAd.getFirst());
		System.out.println(padAndtAd.getSecond());
	}

}
