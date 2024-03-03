package entities;

class Demo1 extends Thread{
	
	public void run() {
		System.out.println("Banking task started");
		
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Banking");
		}
		System.out.println("Banking Completed...");
	}
}
	


class Demo2 extends Thread{
	
	public void run() {
		System.out.println("Printing Activity");
		
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing");
		}
		System.out.println("Printing Completed...");
	}
}
	

class Demo3 extends Thread{
	
	public void run() {
		System.out.println("Calculation started");
		
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Calculation");
		}
		System.out.println("Calculation Completed...");
	}
}
	
public class Launch3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
		
	}

}
