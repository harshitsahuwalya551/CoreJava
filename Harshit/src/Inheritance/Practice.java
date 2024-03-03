package Inheritance;

class Harshit{
	int i =5;
	public void show() {
		System.out.println("Super Class");
	}
}

class Haniya extends Harshit{
	public void show() {
		System.out.println(i);
		System.out.println("Sub Class");
	}
	
	
}   

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harshit h = new Haniya();
		h.show();
	}

}