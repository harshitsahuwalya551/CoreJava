package StringClass;

class Person{
	 String name;

	public Person(String name){
	this.name = name;
	}
	
	public Person(){
		this.name = "unkown";
	}
	
	public String getName(){
		return name;
	}
	
}

public class ConstructorPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.getName());
		
		
		
	}

}