package entities;

class Demo4 implements Runnable{
	
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
	


class Demo5 implements Runnable{
	
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
	

class Demo6 implements Runnable{
	
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
	
public class Launch4runnableInterface {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("Maint thread got the chance first");
		Thread t = Thread.currentThread();
		
		System.out.println(t.isAlive());
		Demo4 d4 = new Demo4(); 
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();
		
		
		
		Thread t1 = new Thread(d4);
		Thread t2 = new Thread(d5);
		Thread t3 = new Thread(d6);
		

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Main thread is completing first");
	}

}
