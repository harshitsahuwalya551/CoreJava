package entites;

public class TestApp {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Run");
			}
		};
		Thread thread = new Thread(runnable);
				thread.start();
				System.out.println(thread.getClass().getName());
		
	}
}
