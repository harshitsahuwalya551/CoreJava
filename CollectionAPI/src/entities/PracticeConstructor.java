package entities;

class Demo{
	public Demo() {
		this(5,6);
		System.out.println("Consturctor without paraeters");
	}
	public Demo(int x,int y) {
		System.out.println("x is:"+x+"\nY is:"+y);
	}
}

public class PracticeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		
	}

}
