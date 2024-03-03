package StringClass;

class Alien{
	private int age;
	String name;
	
	public void setAge(int x) {
		if(x>=0)
			{age = x;}else {
				System.out.println("Invalid Input");
			}
	}
	
	public void setName(String x) {
		name = x;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
public class Encapsulation2 {
   
	public static void main(String[] args) {
		Alien a = new Alien();
		a.setAge(23);
		a.setName("Harshit");
		
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
	}

}
