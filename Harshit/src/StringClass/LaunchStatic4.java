package StringClass;

class Harshit{
	private int age;
	private String name;
	
	static int count;
	
	{
		count++;
	}
	
	
	Harshit(){
	}
	
	Harshit(int age){
		this.age = age;
	}
	
	Harshit(int age,String name){
		this.age = age;
		this.name = name;
	}
	
}

public class LaunchStatic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harshit h1 = new Harshit();
		Harshit h2 = new Harshit(28);
		Harshit h3 = new Harshit(28,"Alien");
		
		System.out.println(Harshit.count);
	}

}