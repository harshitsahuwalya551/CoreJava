package StringClass;

class Person{
	private String name;
	private int age;
	private String country;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
}

public class PracticeEncapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("Harshit");
		p.setAge(23);
		p.setCountry("India");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getCountry());
	}

}
