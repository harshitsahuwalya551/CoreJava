package entities;

class Bathroom1 implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathoroom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " exited the bathroom");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LaunchBlockSynchronization {

	public static void main(String[] args)throws Exception {

		Bathroom1 b = new Bathroom1();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Tiktoker");
		
		t1.start();
//		t1.join();
		t2.start();
//		t1.join();
		t3.start();
		
	}

}