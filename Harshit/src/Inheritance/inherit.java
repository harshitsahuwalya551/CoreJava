package Inheritance;

class Telusko{
	private String name;
	private int age;
	
	Telusko()
	{
		System.out.println("Parent Class");
	}
}

class Alien extends Telusko{
	Alien()
	{
		System.out.println("Child class");
	}
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a = new Alien();
		
		
	} 

}
