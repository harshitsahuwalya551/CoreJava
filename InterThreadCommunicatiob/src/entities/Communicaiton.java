package entities;

//producer thread
class Producer extends Thread{
	
	//Producer producing the data in StringBuffer
	StringBuffer sb;
	
	//variable used by thread for communication
	boolean dataProvider = false;
	
	public Producer() {
		sb = new StringBuffer();
	}
	
	public void run() {
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
		
		// informing the consumer that data is produced
		dataProvider = true;
	}
}

//consumer thread 
class Consumer extends Thread{
	
	//creating producer object to get the produced data from stringBuffer
	Producer producer;
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}
	
	public void run() {
		
		//check for the producer dataProvider for the dataProvider variable
		//if true only consume the data otherwise enter into sleeping state
		while(producer.dataProvider==false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//consume the data produced by the producer
		System.out.println(producer.sb);
	}
}

//InEfficient way of interThread communication
public class Communicaiton {

	public static void main(String[] args) {

		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		Thread t1 = new Thread(obj1);//producer thread
		Thread t2 = new Thread(obj2);//consumer thread
		
		t2.start();//consumer should wait
		t1.start();//producer should start
		
	}

}
