package StringClass;

class Aliean{
	private String name;
	private int age;
	
	Aliean(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aliean a = new Aliean("Harshit",23);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
	}
	
}