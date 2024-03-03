package entities;

class Demo extends Thread{
	int total = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts the calculation");
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			System.out.println("Child thread is giving the notification call");
			this.notify();
		}
	}
}

public class NotifyAndNotifyAll  {

	public static void main(String[] args)throws Exception {
		Demo d1 = new Demo();
		d1.start();
		
		synchronized(d1) {
			System.out.println("Main thread is calling wait() method");
			d1.wait();
			System.out.println("Main thread got the notification call");
			System.out.println(d1.total);
		}
		System.out.println(d1.total);
	}

}