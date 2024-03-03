package entities;

class Run1{
	public void run11(){
		System.out.println("Parent Class");
	}
}
class Run2 extends Run1{
	public void run12(){
		System.out.println("First Child Class");
	}
}
class Run3 extends Run2{
	public void run13(){
		System.out.println("Second Child Class");
	}
}

public class Demo11 {
	public static void main(String[] args) {
		Run1 run = new Run3();
		run.run11();
		run.run13();
		Run2 run3 = new Run3();
		run3.run11();
		run3.run12();
		run3.run13;
	}
}
