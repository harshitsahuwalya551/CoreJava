package entites;

import java.util.Iterator;

public class LaunchAnnonymousClassDefinedUnderMethodArgument {
	public static void main(String[] args) {
//		new Thread(
//
//				new Runnable() {
//					@Override
//					public void run() {
//						for(int i = 0;i<5;i++) {
//							System.out.println("Child thread is running");
//						}
//					}
//				}
//				
//				).start();
	
		new Thread( () -> {
						for(int i = 0;i<5;i++) {
							System.out.println("Child thread is running");
						}
					} 	
				).start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Inside Main method");
		}
	}
}