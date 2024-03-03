package entities;

class Pair<T, U>{
	private T first;
	private U second;
	
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}
}

public class PracticeUserDefinedGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, String> nameAndCity = new Pair<>("Harshit","Jharkhand");
		String name = nameAndCity.getFirst();
		String city = nameAndCity.getSecond();
		
		Pair<Integer, Double> cordinates= new Pair<>(10,10.5);
		int x = cordinates.getFirst();
		double y = cordinates.getSecond();
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(x);
		System.out.println(y);

				
	}

}
