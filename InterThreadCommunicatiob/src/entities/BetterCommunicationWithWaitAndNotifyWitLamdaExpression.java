package entities;

//Extending the thread class to create a UserDefined Thread
//class Test extends Thread{
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			try {
//				System.out.println("Child Thread");
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

//Implementing runnable interface through class
//class Test implements Runnable{
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			try {
//				System.out.println("Child Thread");
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class BetterCommunicationWithWaitAndNotifyWitLamdaExpression {
	public static void main(String[] args) {

		//Annonymous Inner Class
//		new Thread(new Runnable() {
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					try {
//						System.out.println("Child Thread");
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
		
		
		
		
		
		//Lamda Expression
		Thread t= new Thread(() -> {
			for(int i=1;i<=5;i++) {
				try {
					System.out.println("Child Thread");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.start();
		
		
	}
}