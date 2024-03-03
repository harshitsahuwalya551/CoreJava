package entities;

class Bathroom implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathoroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " exited the bathroom");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LaunchB {

	public static void main(String[] args) {

		Bathroom b = new Bathroom();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Tiktoker");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}