package entities;

//Producer1 thread
class Producer1 extends Thread{
	
	//Producer1 producing the data in StringBuffer
	StringBuffer sb;
	
	
	public Producer1() {
		sb = new StringBuffer();
	}	
	
	public void run() {
		synchronized(sb) {
		for(int i=1;i<=10;i++) {
			try {
				sb.append(i +": ");
				Thread.sleep(100);
				System.out.println("Appending"); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//send the notification to the waiting thread
			sb.notify();
		}
		
		
	}
}

//Consumer1 thread 
class Consumer1 extends Thread{
	
	//creating Producer1 object to get the produced data from stringBuffer
	Producer1 Producer1;
	
	public Consumer1(Producer1 Producer1) {
		this.Producer1 = Producer1;
	}
	
	public void run() {
		
		synchronized(Producer1.sb) {
			try {
				//wait till the notification is sent by Producer1
				Producer1.sb.wait();
				System.out.println(Producer1.sb);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//consume the data produced by the Producer1
		} 
	}
}

//InEfficient way of interThread communication
public class BetterCommuncationWithWaitAndNotify {

	public static void main(String[] args) {

		Producer1 obj1 = new Producer1();
		Consumer1 obj2 = new Consumer1(obj1);
		
		Thread t1 = new Thread(obj1);//Producer1 thread
		Thread t2 = new Thread(obj2);//Consumer1 thread
		
		t2.start();//Consumer1 should wait
		t1.start();//Producer1 should start
		
	}

}
