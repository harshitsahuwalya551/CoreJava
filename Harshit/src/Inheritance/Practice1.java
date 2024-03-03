package Inheritance;

class Aa{
	public int add(int x,int y) {
		return x+y;
	}
}

class Bb extends Aa{
	public int sub(int x,int y) {
		return x-y;
	}
}

class Cc extends Bb{
	public int mul(int x,int y) {
		return x*y;
	}
}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cc obj = new Cc();
		System.out.println(obj.add(3, 4));
		System.out.println(obj.sub(6, 3));
		System.out.println(obj.mul(5, 2));
	}

}