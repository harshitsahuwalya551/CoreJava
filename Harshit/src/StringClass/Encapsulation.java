package StringClass;

//import java.util.*;

class Books{

	private int pageNo;
	
	public void setPageNo(int x) {
		if(x>=0) {
			pageNo = x;
		}else {
			System.out.println("Invalid Input");
		}
	}
	
	public int getPageNo() {
		return pageNo;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Books b = new Books();
//		b.pageNo = 100; error
//		System.out.println(b.pageNo);
		b.setPageNo(1000);
		System.out.println(b.getPageNo());
		
	}

}