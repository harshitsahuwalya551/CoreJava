package polymorphism;

class Animal1{
		 public void eat() {
			 System.out.println("Animal Eat");
		 }
		 public void sleep() {
			 System.out.println("Animal Sleep");
		 }
}

class Tiger extends Animal1{
	public void eat() {
		System.out.println("Tiger need food in big amount");
	}
	
	public void sleep() {
		System.out.println("Tiger sleeps in day");
	}
}

class Monkey extends Animal1{
	public void eat(){
		System.out.println("Monkey eat in day time");
	}
	public void sleep() {
		System.out.println("Monkey sleep in night");
	}
}

class Deer extends Animal1{
	public void eat() {
		System.out.println("Deer are vegetarian");
	}
	public void sleep() {
		System.out.println("Deer sleep in night");
	}
}

class Call{
	public void work(Animal1 a) {
		a.eat();
		a.sleep();
	}
}

public class Animal {
	public static void main(String args[]) {
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		Deer d = new Deer();
		
		Call c = new Call();
		c.work(t);
		c.work(m);
		c.work(d);
	}
}