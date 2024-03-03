package entities;

class Demo extends Thread{
	public void run() {
		
		String name = Thread.currentThread().getName();
		if(name.equals("Banking")) {
			banking();
		}else if(name.equals("Driving")){
			driving();
		}else {
			dancing();
		}
		
	}
	synchronized public void banking() {
		try {
		System.out.println("Banking Executed");
		Thread.sleep(1000);
		System.out.println("Banking Ended");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void driving() {
		try {
			System.out.println("Driving Started");
			Thread.sleep(1000);
			System.out.println("Driving Ended");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void dancing() {
		try {
			System.out.println("Dancing Started");
			Thread.sleep(1000);
			System.out.println("Dancing ended");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class LaunchsingleThread {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.setName("Banking");
		d2.setName("Driving");
		d3.setName("Dancing");
		d1.start();
		d2.start();
		d3.start();
	}

}
