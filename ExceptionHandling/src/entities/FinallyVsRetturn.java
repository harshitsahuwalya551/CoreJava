package entities;

class Demo2{
	int disp() {
		try {
		System.out.println("Disp");
		return 10;
		}
		finally{
		System.out.println("Display last line");
		}
	}
}

public class FinallyVsRetturn {
	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		System.out.println(d.disp());
	}
}
