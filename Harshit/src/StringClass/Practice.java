package StringClass;
import java.util.*;
class AdrakChai{
	static int noOfGlass=0;
	{
		System.out.println("Are you alone! yes or no");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		if(id==1) {
			noOfGlass+=1;
		}else{
			noOfGlass+=2;
		}

	}
	
	public int getBill(){
		
		int bill = 20 * noOfGlass;
		return bill;
		
	}
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdrakChai ac = new AdrakChai();
		System.out.println("Your bill is:"+ac.getBill());
	}

}