package entities;

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		t.setName("HArshit");
		t.setPriority(4);
		System.out.println(t);
	}

}
