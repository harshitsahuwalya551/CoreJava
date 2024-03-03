package entities;
import java.util.*;

class highWarning extends Exception{
	highWarning(String msg){
		super(msg);
	}
}
class lowWarning extends Exception{
	lowWarning(String msg){
		super(msg);
	}
}
class goodToGo extends Exception{
	goodToGo(String msg){
		super(msg);
	}
}

class Fee{
	private int fee;
	Scanner scan = new Scanner(System.in);
	public void input() {
		System.out.println("Please enter your remaining fee");
		fee = scan.nextInt();
	}
	public void verify() throws highWarning,lowWarning,goodToGo{
		if(fee>10000) {
			throw new highWarning("You cannot attend the class");
		}else if(fee>0 && fee<10000) {
			throw new lowWarning("You can attend the class for 1 week only");
		}else if(fee == 0) {
			throw new goodToGo("All cleared Fee submitted");
		}
	}
}

class College{
	public void check() {
		Fee f = new Fee();
		try {
			f.input();
			f.verify();
		}
		catch(highWarning h1) {
			System.out.println(h1.getMessage());
			try {
				f.input();
				f.verify();
			}
			catch(highWarning h2) {
				System.out.println("Seems Suspicius");
				System.out.println(h2.getMessage());
				System.exit(0);
			}
			catch(lowWarning l2) {
				System.out.println("Seems Suspicius");
				System.out.println(l2.getMessage());
				System.exit(0);
			}
			catch(goodToGo g1) {
				System.out.println("Everything is Good");
				System.out.println(g1.getMessage());
				System.exit(0);
			}
		}
		catch(lowWarning l1) {
			System.out.println(l1.getMessage());
			try {
				f.input();
				f.verify();
			}
			catch(highWarning h1) {
				System.out.println("Seems Suspicius");
				System.out.println(h1.getMessage());
				System.exit(0);
			}
			catch(lowWarning h2) {
				System.out.println("Seems Suspicius");
				System.out.println(h2.getMessage());
				System.exit(0);				
			}
			catch(goodToGo g2) {
				System.out.println("Everything is Good");
				System.out.println(g2.getMessage());
				System.exit(0);
			}
		}
		catch(goodToGo g3){
			System.out.println(g3.getMessage());
			System.exit(0);
		}
	}
}

public class Demoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.check();
	}

}