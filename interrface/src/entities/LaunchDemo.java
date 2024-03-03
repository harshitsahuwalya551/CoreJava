package entities;

class Computer{
	public void config() {
		System.out.println("8Gb,16Gb,1TB");
	}
}



public class LaunchDemo {
	public static void main(String[] args) {
		Computer com = new Computer() {
			public void config() {
				System.out.println("13GB,12GB,1TB");
			}
		};
		com.config();
	}
}
