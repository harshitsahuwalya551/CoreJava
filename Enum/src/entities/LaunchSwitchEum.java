package entities;

enum Result1{
	PASS, FAIL, NR;
	//public final static Resut1 PASS = new Result1();
	Result1(){
		System.out.println("");
	}
}

public class LaunchSwitchEum {
	public static void main(String[] args) {
		Result1 result1 = Result1.NR;
		switch(result1) {
		case PASS : System.out.println("PASSED");
		break;
		case FAIL : System.out.println("FAILES");
		break;
		case NR : System.out.println("RESULT NOT AVAILABLE");
		break;
		}
	}
}